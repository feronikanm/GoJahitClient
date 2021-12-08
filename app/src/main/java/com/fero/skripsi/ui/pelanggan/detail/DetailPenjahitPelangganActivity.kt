package com.fero.skripsi.ui.pelanggan.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.fero.skripsi.R
import com.fero.skripsi.databinding.ActivityDetailPenjahitPelangganBinding
import com.fero.skripsi.databinding.ContentDataPenjahitBinding
import com.fero.skripsi.model.DetailKategoriNilai
import com.fero.skripsi.model.Pelanggan
import com.fero.skripsi.ui.pelanggan.detail.adapter.ListKategoriInDetailAdapter
import com.fero.skripsi.ui.pelanggan.detail.viewmodel.KategoriPenjahitInPelangganViewModel
import com.fero.skripsi.utils.Constant
import com.fero.skripsi.utils.PrefHelper
import com.fero.skripsi.utils.PrefHelper.Companion.PREF_ID_PELANGGAN
import com.fero.skripsi.utils.PrefHelper.Companion.PREF_NAMA_PELANGGAN
import com.fero.skripsi.utils.ViewModelFactory
import com.google.gson.Gson

class DetailPenjahitPelangganActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailPenjahitPelangganBinding
    private lateinit var contentBinding: ContentDataPenjahitBinding

    lateinit var prefHelper: PrefHelper

    companion object {
        const val EXTRA_DATA_PENJAHIT = "EXTRA_DATA_PENJAHIT"
        const val EXTRA_DATA_PELANGGAN = "EXTRA_DATA_PELANGGAN"
        private const val SHOW_DETAIL_KETEGORI = "ShowDetailKategori"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailPenjahitPelangganBinding.inflate(layoutInflater)
        contentBinding = binding.detailPenjahit
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.collapsingToolbar.setTitle("Data Penjahit")
        toolbarTextAppernce()

        prefHelper = PrefHelper(this)
        val namaPelanggan = prefHelper.getString(PREF_NAMA_PELANGGAN)
        val idPelanggan = prefHelper.getString(PREF_ID_PELANGGAN)

        contentBinding.tvNamaPelanggan.text = namaPelanggan
        contentBinding.tvIdPelanggan.text = idPelanggan

        val extraDataNilai: DetailKategoriNilai? = intent.extras?.getParcelable(EXTRA_DATA_PENJAHIT)
        val extraDataPelanggan: Pelanggan? = intent.extras?.getParcelable(EXTRA_DATA_PELANGGAN)

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[KategoriPenjahitInPelangganViewModel::class.java]

        viewModel.apply {
            listDetailKategori.observe(this@DetailPenjahitPelangganActivity, {
                setupRvDetailKategori(it)
            })

            eventShowProgress.observe(this@DetailPenjahitPelangganActivity, {
                if (it) {
                    contentBinding.progressBar.visibility = View.VISIBLE
                } else {
                    contentBinding.progressBar.visibility = View.GONE
                }
            })

            eventErrorMessage.observe(this@DetailPenjahitPelangganActivity, {
                Toast.makeText(this@DetailPenjahitPelangganActivity, it, Toast.LENGTH_SHORT).show()
            })

            eventIsEmpty.observe(this@DetailPenjahitPelangganActivity, {
                // setupEventEmptyView(binding?.{EMPTY_VIEW MU}!! ,it)
            })
            getListDetailKategori(extraDataNilai!!)
        }



        binding.apply {
            if (extraDataNilai != null) {
                tvNamaToko.text = extraDataNilai.nama_toko
                tvNamaPenjahit.text = extraDataNilai.nama_penjahit
//                tvRating.text = extraDataNilai.nilai_akhir.toString()

                Glide.with(this@DetailPenjahitPelangganActivity)
                    .load("${Constant.IMAGE_PENJAHIT}${extraDataNilai.foto_penjahit}")
                    .into(imgPenjahit)
            }
        }

        contentBinding.apply {
            tvNamaPenjahit.text = extraDataNilai!!.nama_penjahit
            tvEmailPenjahit.text = extraDataNilai.email_penjahit
            tvTeleponPenjahit.text = extraDataNilai.telp_penjahit
            tvAlamatPenjahit.text = extraDataNilai.alamat_penjahit
        }

        contentBinding.btnGoToMaps.setOnClickListener {
            Toast.makeText(this, "Cliked", Toast.LENGTH_SHORT).show()
            Log.d("Test", "CLICKED")
            val intent = Intent(this, MapsRoutePelangganActivity::class.java)
            intent.putExtra(MapsRoutePelangganActivity.EXTRA_DATA_PENJAHIT, extraDataNilai)
            intent.putExtra(MapsRoutePelangganActivity.EXTRA_DATA_PELANGGAN, extraDataPelanggan)
            startActivity(intent)
        }
    }

    private fun setupRvDetailKategori(data: List<DetailKategoriNilai>?) {
        val listKategoriInDetailAdapter = ListKategoriInDetailAdapter()
        listKategoriInDetailAdapter.setDetailKategori(data!!)

        contentBinding.rvDetailKategori.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = listKategoriInDetailAdapter
        }

        listKategoriInDetailAdapter.setOnItemClickCallback(object : ListKategoriInDetailAdapter.OnItemClickCallback{
            override fun onItemClicked(data: DetailKategoriNilai) {

                Toast.makeText(this@DetailPenjahitPelangganActivity, "Melakukan Jahitan " + data.nama_kategori , Toast.LENGTH_SHORT).show()

                val detailKategoriInPelangganFragment = DetailKategoriInPelangganFragment()

                val bundle = Bundle()
                val bundleData = Gson().toJson(data)
                bundle.putString("EXTRA_DETAIL_KATEGORI", bundleData)
                detailKategoriInPelangganFragment.arguments = bundle

                detailKategoriInPelangganFragment.show(supportFragmentManager, SHOW_DETAIL_KETEGORI)

            }
        })
    }

    private fun toolbarTextAppernce() {
        binding.collapsingToolbar.setCollapsedTitleTextAppearance(R.style.collapsedappbar)
        binding.collapsingToolbar.setExpandedTitleTextAppearance(R.style.expandedappbar)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}