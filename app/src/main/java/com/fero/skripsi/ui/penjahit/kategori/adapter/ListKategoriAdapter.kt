package com.fero.skripsi.ui.penjahit.kategori.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fero.skripsi.databinding.ItemListKategoriBinding
import com.fero.skripsi.model.DetailKategoriPenjahit
import com.fero.skripsi.utils.Constant

class ListKategoriAdapter : RecyclerView.Adapter<ListKategoriAdapter.ListKategoriViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    private lateinit var onDeleteClickCallback: OnDeleteClickCallback
    private lateinit var onUpdateClickCallback: OnUpdateClickCallback
    var listDetailKategori = mutableListOf<DetailKategoriPenjahit>()


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    fun setOnDeleteClickCallback(onDeleteClickCallback: OnDeleteClickCallback){
        this.onDeleteClickCallback = onDeleteClickCallback
    }

    fun setOnUpdateClickCallback(onUpdateClickCallback: OnUpdateClickCallback){
        this.onUpdateClickCallback = onUpdateClickCallback
    }

    fun setDetailKategori(kategoriPenjahit: List<DetailKategoriPenjahit>){
        this.listDetailKategori.clear()
        this.listDetailKategori.addAll(kategoriPenjahit)
    }

    fun deleteItem(position: Int) {
        Log.d("Position Removed", position.toString())
        this.listDetailKategori.removeAt(position)
        notifyItemRemoved(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListKategoriViewHolder {
        val itemListKategoriBinding = ItemListKategoriBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListKategoriViewHolder(itemListKategoriBinding)
    }

    override fun onBindViewHolder(holder: ListKategoriViewHolder, position: Int) {
        val data = listDetailKategori[position]
        holder.bind(data, position)
    }

    override fun getItemCount(): Int {
        return listDetailKategori.size
    }

    inner class ListKategoriViewHolder(private var binding: ItemListKategoriBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DetailKategoriPenjahit, position: Int){
            binding.apply {

                tvKategori.text = data.nama_kategori

                Glide.with(root.context)
                    .load("${Constant.IMAGE_KATEGORI}${data.gambar_kategori}")
                    .into(imgKategori)

                btnDelete.setOnClickListener {
                    onDeleteClickCallback.onDeleteClicked(listDetailKategori[adapterPosition], position)
//                    popupDelete(root.context)
//                    deleteData(root.context, data)
                }

                btnEdit.setOnClickListener {
                    onUpdateClickCallback.onUpdateClikced(listDetailKategori[adapterPosition])
                }

                root.setOnClickListener {
                    onItemClickCallback.onItemClicked(listDetailKategori[adapterPosition])

                }
            }
        }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: DetailKategoriPenjahit)
    }

    interface OnDeleteClickCallback{
        fun onDeleteClicked(data: DetailKategoriPenjahit, position: Int)
    }

    interface OnUpdateClickCallback{
        fun onUpdateClikced(data: DetailKategoriPenjahit)
    }


}