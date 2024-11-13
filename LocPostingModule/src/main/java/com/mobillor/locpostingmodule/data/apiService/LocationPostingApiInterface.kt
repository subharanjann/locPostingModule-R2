package com.mobillor.locpostingmodule.data.apiService

import com.mobillor.locpostingmodule.data.model.InputMappedtoBin
import com.mobillor.locpostingmodule.data.model.InputMappedtoItem
import com.mobillor.locpostingmodule.data.model.InputMappedtoPallet
import com.mobillor.locpostingmodule.data.model.ResponseBinCode
import com.mobillor.locpostingmodule.data.model.ResponseBinInfo
import com.mobillor.locpostingmodule.data.model.ResponseItemInfo
import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.data.model.ResponseMappedToBin
import com.mobillor.locpostingmodule.data.model.ResponseMappedToPallet
import com.mobillor.locpostingmodule.data.model.ResponsePalletCode
import com.mobillor.locpostingmodule.data.model.ResponsePalletInfo
import com.mobillor.locpostingmodule.data.model.ResponsePutawayBinTransfer
import com.mobillor.locpostingmodule.data.model.ResponsePutawayItemTransfer
import com.mobillor.locpostingmodule.data.model.ResponsePutawayPalletTransfer
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface LocationPostingApiInterface {


    @GET("transfer/pallet/scan")
  suspend  fun getPalletWithId(@Header("Authorization") token: String, @Query("palletCode") palletId: String): Response<ResponsePalletInfo>

   @GET("location_posting/scan_sku")
  suspend fun getItemWithId(@Header("Authorization") token: String,@Query("suid") suid : String): Response<ResponseItemInfo>

   @GET("bin_transfer/scan_source_bin")
   suspend fun getBinWithId(@Header("Authorization") token: String,@Query("binCode") binCode : String): Response<ResponseBinInfo>

    @GET("transfer/location/scan_location")
 suspend fun getLocationCode(@Query("location") location : String): Response<ResponseLocationCode>


    //pallet data getting and putaway
    @GET("transfer/location/get_materials_mapped_to_pallet_by_pallet_id")
    suspend fun getMaterialsMappedToPalletByPalletId(@Query("palletId") palletId: Int): Response<ResponseMappedToPallet>
    @POST("transfer/location/transfer_location")
    suspend fun palletTransferLocation(@Body requestBody: InputMappedtoPallet): Response<ResponsePutawayPalletTransfer>

    //item data getting and putaway


    @POST("location_posting/item/transfer")
    suspend  fun  itemTransferLocation(@Body requestBody: InputMappedtoItem): Response<ResponsePutawayItemTransfer>

    @GET("bin_transfer/scan_source_bin")
    suspend  fun getBincode(@Query("binCode")binCode: String):Response <ResponseBinCode>

    //bin data getting and putaway
    @GET("bin_transfer/location/get_materials_mapped_to_bin")
    suspend fun getMaterialsMappedToBinByBinId(@Query("binId")binId : Int): Response<ResponseMappedToBin>

    @GET("pallet/get_by_palletId")
    suspend  fun getPalletCode(@Query("palletCode")palletCode :String): Response<ResponsePalletCode>

    @POST("bin_transfer/location/transfer_location")
    suspend fun binTransferLocation(@Body requestBody: InputMappedtoBin) : Response <ResponsePutawayBinTransfer>

}