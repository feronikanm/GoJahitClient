package com.fero.skripsi.utils

object Constant {

//    const val BASE_URL = "https://penjahitapi.000webhostapp.com"
    const val BASE_URL = "https://adminapipenjahit.000webhostapp.com/"
//    const val BASE_URL = "http://gojahitapp.herokuapp.com"
    const val PATH_API = "api"

//    const val IMAGE_PENJAHIT = "https://penjahitapi.000webhostapp.com/img_penjahit/"
//    const val IMAGE_PELANGGAN = "https://penjahitapi.000webhostapp.com/img_pelanggan/"
//    const val IMAGE_KATEGORI = "https://penjahitapi.000webhostapp.com/img_kategori/"
//    const val IMAGE_UKURAN = "https://penjahitapi.000webhostapp.com/img_ukuran/"

    const val IMAGE_PENJAHIT = "https://adminapipenjahit.000webhostapp.com/img_penjahit/"
    const val IMAGE_PELANGGAN = "https://adminapipenjahit.000webhostapp.com/img_pelanggan/"
    const val IMAGE_KATEGORI = "https://adminapipenjahit.000webhostapp.com/img_kategori/"
    const val IMAGE_UKURAN = "https://adminapipenjahit.000webhostapp.com/img_ukuran/"

    const val PATH_DETAIL_KATEGORI = "/detail_kategori"
    const val PATH_GET_PENJAHIT = "/get_penjahit"
    const val PATH_GET_KATEGORI = "/get_kategori"
    const val PATH_GET_DETAIL_KATEGORI = "/get_detail_kategori"
    const val PATH_DETAIL_PESANAN = "/detail_pesanan"
    const val PATH_KATEGORI = "/kategori"
    const val PATH_PELANGGAN = "/pelanggan"
    const val PATH_ID_PELANGGAN = "/{id_pelanggan}"
    const val PATH_PENJAHIT = "/penjahit"
    const val PATH_ID_PENJAHIT = "/{id_penjahit}"
    const val PATH_ID_KATEGORI = "/{id_kategori}"
    const val PATH_ID_DETAIL_KATEGORI = "/{id_detail_kategori}"
    const val PATH_ID_UKURAN_DETAIL_KATEGORI = "/{id_ukuran_detail_kategori}"
    const val PATH_ID_PESANAN = "/{id_pesanan}"
    const val PATH_NILAI = "/nilai"
    const val PATH_PESANAN = "/pesanan"
    const val PATH_RATING = "/rating"
    const val PATH_UKURAN = "/ukuran"
    const val PATH_UTILITAS = "/utilitas"
    const val PATH_UKURAN_DETAIL_KATEGORI = "/ukuran_detail_kategori"
    const val PATH_UKURAN_DETAIL_PESANAN = "/ukuran_detail_pesanan"

    const val PATH_INSERT_DATA = "/insert_data"
    const val PATH_UPDATE = "/update"
    const val PATH_DELETE = "/delete"


    const val URL_DETAIL_KATEGORI_GET = "$PATH_API$PATH_DETAIL_KATEGORI"
    const val URL_DETAIL_KATEGORI_GET_BY_PENJAHIT = "$PATH_API$PATH_DETAIL_KATEGORI$PATH_GET_PENJAHIT$PATH_ID_PENJAHIT"
    const val URL_DETAIL_KATEGORI_INSERT = "$PATH_API$PATH_DETAIL_KATEGORI$PATH_INSERT_DATA"
    const val URL_DETAIL_KATEGORI_UPDATE = "$PATH_API$PATH_DETAIL_KATEGORI$PATH_UPDATE$PATH_ID_DETAIL_KATEGORI"
    const val URL_DETAIL_KATEGORI_DELETE = "$PATH_API$PATH_DETAIL_KATEGORI$PATH_DELETE$PATH_ID_DETAIL_KATEGORI"
//    https://penjahitapi.000webhostapp.com/api/detail_kategori/get_kategori/2
    const val URL_DETAIL_KATEGORI_GET_BY_KATEGORI = "$PATH_API$PATH_DETAIL_KATEGORI$PATH_GET_KATEGORI$PATH_ID_KATEGORI"

    const val URL_DETAIL_PESANAN_GET = "$PATH_API$PATH_DETAIL_PESANAN"
    const val URL_DETAIL_PESANAN_INSERT = "$PATH_API$PATH_DETAIL_PESANAN$PATH_INSERT_DATA"
    const val URL_DETAIL_PESANAN_UPDATE = "$PATH_API$PATH_DETAIL_PESANAN$PATH_UPDATE"
    const val URL_DETAIL_PESANAN_DELETE = "$PATH_API$PATH_DETAIL_PESANAN$PATH_DELETE"

    const val URL_KATEGORI_GET = "$PATH_API$PATH_KATEGORI"
    const val URL_KATEGORI_INSERT = "$PATH_API$PATH_KATEGORI$PATH_INSERT_DATA"
    const val URL_KATEGORI_UPDATE = "$PATH_API$PATH_KATEGORI$PATH_UPDATE"
    const val URL_KATEGORI_DELETE = "$PATH_API$PATH_KATEGORI$PATH_DELETE"

    const val URL_PELANGGAN_GET = "$PATH_API$PATH_PELANGGAN"
    const val URL_PELANGGAN_INSERT = "$PATH_API$PATH_PELANGGAN$PATH_INSERT_DATA"
    const val URL_PELANGGAN_UPDATE = "$PATH_API$PATH_PELANGGAN$PATH_UPDATE$PATH_ID_PELANGGAN"
    const val URL_PELANGGAN_DELETE = "$PATH_API$PATH_PELANGGAN$PATH_DELETE"

    const val URL_PENJAHIT_GET_BY_NILAI = "$PATH_API$PATH_NILAI"
    const val URL_PENJAHIT_GET = "$PATH_API$PATH_PENJAHIT"
    const val URL_PENJAHIT_INSERT = "$PATH_API$PATH_PENJAHIT$PATH_INSERT_DATA"
    const val URL_PENJAHIT_UPDATE = "$PATH_API$PATH_PENJAHIT$PATH_UPDATE$PATH_ID_PENJAHIT"
    const val URL_PENJAHIT_DELETE = "$PATH_API$PATH_PENJAHIT$PATH_DELETE"

    const val URL_PESANAN_GET = "$PATH_API$PATH_PESANAN"
    const val URL_PESANAN_GET_BY_ID = "$PATH_API$PATH_PESANAN$PATH_ID_PESANAN"
    const val URL_PESANAN_INSERT = "$PATH_API$PATH_PESANAN$PATH_INSERT_DATA"
    const val URL_PESANAN_UPDATE = "$PATH_API$PATH_PESANAN$PATH_UPDATE"
    const val URL_PESANAN_DELETE = "$PATH_API$PATH_PESANAN$PATH_DELETE"

    const val URL_RATING_GET = "$PATH_API$PATH_RATING"
    const val URL_RATING_INSERT = "$PATH_API$PATH_RATING$PATH_INSERT_DATA"
    const val URL_RATING_UPDATE = "$PATH_API$PATH_RATING$PATH_UPDATE"
    const val URL_RATING_DELETE = "$PATH_API$PATH_RATING$PATH_DELETE"

    const val URL_UKURAN_GET = "$PATH_API$PATH_UKURAN"
    const val URL_UKURAN_INSERT = "$PATH_API$PATH_UKURAN$PATH_INSERT_DATA"
    const val URL_UKURAN_UPDATE = "$PATH_API$PATH_UKURAN$PATH_UPDATE"
    const val URL_UKURAN_DELETE = "$PATH_API$PATH_UKURAN$PATH_DELETE"

    const val URL_UTILITAS_GET = "$PATH_API$PATH_UTILITAS"
    const val URL_UTILITAS_INSERT = "$PATH_API$PATH_UTILITAS$PATH_INSERT_DATA"
    const val URL_UTILITAS_UPDATE = "$PATH_API$PATH_UTILITAS$PATH_UPDATE"
    const val URL_UTILITAS_DELETE = "$PATH_API$PATH_DETAIL_KATEGORI$PATH_DELETE"

    const val URL_UKURAN_DETAIL_KATEGORI_GET = "$PATH_API$PATH_UKURAN_DETAIL_KATEGORI"
//    https://penjahitapi.000webhostapp.com/api/ukuran_detail_kategori/get_detail_kategori/9
    const val URL_UKURAN_DETAIL_KATEGORI_GET_BY_DETAIL_KATEGORI = "$PATH_API$PATH_UKURAN_DETAIL_KATEGORI$PATH_GET_DETAIL_KATEGORI$PATH_ID_DETAIL_KATEGORI"
    const val URL_UKURAN_DETAIL_KATEGORI_INSERT = "$PATH_API$PATH_UKURAN_DETAIL_KATEGORI$PATH_INSERT_DATA"
    const val URL_UKURAN_DETAIL_KATEGORI_UPDATE = "$PATH_API$PATH_UKURAN_DETAIL_KATEGORI$PATH_UPDATE"
    const val URL_UKURAN_DETAIL_KATEGORI_DELETE = "$PATH_API$PATH_UKURAN_DETAIL_KATEGORI$PATH_DELETE$PATH_ID_UKURAN_DETAIL_KATEGORI"

    const val URL_UKURAN_DETAIL_PESANAN_GET = "$PATH_API$PATH_UKURAN_DETAIL_PESANAN"
    const val URL_UKURAN_DETAIL_PESANAN_INSERT = "$PATH_API$PATH_UKURAN_DETAIL_PESANAN$PATH_INSERT_DATA"
    const val URL_UKURAN_DETAIL_PESANAN_UPDATE = "$PATH_API$PATH_UKURAN_DETAIL_PESANAN$PATH_UPDATE"
    const val URL_UKURAN_DETAIL_PESANAN_DELETE = "$PATH_API$PATH_UKURAN_DETAIL_PESANAN$PATH_DELETE"

}