package com.fero.skripsi.data

import com.fero.skripsi.data.source.ResponseCallback
import com.fero.skripsi.data.source.remote.RemoteDataSource
import com.fero.skripsi.model.*

class Repository private constructor(private val remoteDataSource: RemoteDataSource) : DataSource{

    companion object {
        @Volatile
        private var instance: Repository? = null
        fun getInstance(remoteData: RemoteDataSource): Repository =
            instance ?: synchronized(this) {
                instance ?: Repository(remoteData).apply { instance = this }
            }
    }

    override fun getDataPenjahit(callback: ResponseCallback<List<DetailKategoriNilai>>) {
        remoteDataSource.getDataPenjahit(callback)
    }

    override fun getDataKategori(callback: ResponseCallback<List<DetailKategoriNilai>>) {
        remoteDataSource.getDataKategori(callback)
    }

    override fun registerPelanggan(
        data: Pelanggan,
        responseCallback: ResponseCallback<Pelanggan>
    ) {
        remoteDataSource.registerPelanggan(data, responseCallback)
    }

    override fun loginPelanggan(
        email: String, password: String,
        responseCallback: ResponseCallback<Pelanggan>
    ) {
        remoteDataSource.loginPelanggan(email, password, responseCallback)
    }

    override fun updatePelanggan(
        data: Pelanggan,
        responseCallback: ResponseCallback<Pelanggan>
    ) {
        remoteDataSource.updatePelanggan(data, responseCallback)
    }

    override fun registerPenjahit(
        data: Penjahit,
        responseCallback: ResponseCallback<Penjahit>
    ) {
        remoteDataSource.registerPenjahit(data, responseCallback)
    }

    override fun loginPenjahit(
        email: String, password: String,
        responseCallback: ResponseCallback<Penjahit>
    ) {
        remoteDataSource.loginPenjahit(email, password, responseCallback)
    }

    override fun updatePenjahit(data: Penjahit, responseCallback: ResponseCallback<Penjahit>) {
        remoteDataSource.updatePenjahit(data, responseCallback)
    }

    override fun getListDetailKategori(data: Penjahit, callback: ResponseCallback<List<DetailKategoriPenjahit>>) {
        remoteDataSource.getListDetailKategori(data, callback)
    }

    override fun getListDetailKategoriInPelanggan(data: DetailKategoriNilai, callback: ResponseCallback<List<DetailKategoriNilai>>
    ) {
        remoteDataSource.getListDetailKategoriInPelanggan(data, callback)
    }

    override fun insertDataDetailKategoriPenjahit(
        data: DetailKategori,
        responseCallback: ResponseCallback<DetailKategori>
    ) {
        remoteDataSource.insertDataDetailKategoriPenjahit(data, responseCallback)
    }

    override fun deleteDataDetailKategori(
        data: DetailKategoriPenjahit,
        responseCallback: ResponseCallback<DetailKategoriPenjahit>
    ) {
        remoteDataSource.deleteDataDetailKategori(data, responseCallback)
    }

    override fun updateDataDetailKategori(
        data: DetailKategoriPenjahit,
        responseCallback: ResponseCallback<DetailKategoriPenjahit>
    ) {
        remoteDataSource.updateDataDetailKategori(data, responseCallback)
    }

    override fun getDataPenjahitByKategori(
        data: DetailKategoriNilai,
        callback: ResponseCallback<List<DetailKategoriNilai>>
    ) {
        remoteDataSource.getDataPenjahitByKategori(data, callback)
    }

    override fun getDataUkuran(callback: ResponseCallback<List<UkuranDetailKategori>>) {
        remoteDataSource.getDataUkuran(callback)
    }

    override fun getUkuranByDetailKategori(
        data: UkuranDetailKategori,
        callback: ResponseCallback<List<UkuranDetailKategori>>
    ) {
        remoteDataSource.getUkuranByDetailKategori(data, callback)
    }

    override fun insertDataUkuranDetailKategori(
        data: UkuranDetailKategori,
        responseCallback: ResponseCallback<UkuranDetailKategori>
    ) {
        remoteDataSource.insertDataUkuranDetailKategori(data, responseCallback)
    }

    override fun deleteDataUkuranDetailKategori(
        data: UkuranDetailKategori,
        responseCallback: ResponseCallback<UkuranDetailKategori>
    ) {
        remoteDataSource.deleteDataUkuranDetailKategori(data, responseCallback)
    }

    override fun insertDataRating(data: Rating, responseCallback: ResponseCallback<Rating>) {
        remoteDataSource.insertDataRating(data, responseCallback)
    }

    override fun getDataPesananById(data: Pesanan, responseCallback: ResponseCallback<Pesanan>) {
        TODO("Not yet implemented")
    }

    override fun insertDataPesanan(data: Pesanan, responseCallback: ResponseCallback<Pesanan>) {
        TODO("Not yet implemented")
    }

    override fun updateDataPesanan(data: Pesanan, responseCallback: ResponseCallback<Pesanan>) {
        TODO("Not yet implemented")
    }

    override fun deleteDataPesanan(data: Pesanan, responseCallback: ResponseCallback<Pesanan>) {
        TODO("Not yet implemented")
    }


}