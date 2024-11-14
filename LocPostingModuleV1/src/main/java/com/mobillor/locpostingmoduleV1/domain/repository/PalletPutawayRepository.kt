package com.mobillor.locpostingmoduleV1.domain.repository

import com.mobillor.locpostingmoduleV1.data.model.InputMappedtoPallet
import com.mobillor.locpostingmoduleV1.data.model.ResponseLocationCode
import com.mobillor.locpostingmoduleV1.data.model.ResponseMappedToPallet
import com.mobillor.locpostingmoduleV1.data.model.ResponsePutawayPalletTransfer
import com.mobillor.locpostingmoduleV1.util.Resource


interface PalletPutawayRepository {
    suspend fun fetchLocationCode(token : String,scannedLoc: String) : Resource<ResponseLocationCode>
    suspend fun fetchMappedToPallet(token : String,id : Int) : Resource<ResponseMappedToPallet>
    suspend fun fetchResponseFromPalletTransfer(token : String,dataset : InputMappedtoPallet): Resource<ResponsePutawayPalletTransfer>
}