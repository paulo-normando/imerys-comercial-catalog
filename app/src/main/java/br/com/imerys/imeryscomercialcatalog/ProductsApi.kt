package br.com.imerys.imeryscomercialcatalog

import br.com.imerys.imeryscomercialcatalog.domain.Solutions1
import retrofit2.Call
import retrofit2.http.GET

interface ProductsApi {

    @GET("products.json")
    fun getProducts() : Call<List<Solutions1>>

}