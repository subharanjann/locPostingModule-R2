package com.mobillor.locpostingmodule.domain.repository

import com.mobillor.locpostingmodule.data.model.InputMappedtoPallet
import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.data.model.ResponseMappedToPallet
import com.mobillor.locpostingmodule.data.model.ResponsePutawayPalletTransfer
import com.mobillor.locpostingmodule.util.Resource


interface PalletPutawayRepository {
    suspend fun fetchLocationCode(token : String,scannedLoc: String) : Resource<ResponseLocationCode>
    suspend fun fetchMappedToPallet(token : String,id : Int) : Resource<ResponseMappedToPallet>
    suspend fun fetchResponseFromPalletTransfer(token : String,dataset : InputMappedtoPallet): Resource<ResponsePutawayPalletTransfer>
}