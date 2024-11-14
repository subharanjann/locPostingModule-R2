package com.swms.locpostingmoduleV1.domain.repository

import com.swms.locpostingmoduleV1.data.model.InputMappedtoPallet
import com.swms.locpostingmoduleV1.data.model.ResponseLocationCode
import com.swms.locpostingmoduleV1.data.model.ResponseMappedToPallet
import com.swms.locpostingmoduleV1.data.model.ResponsePutawayPalletTransfer
import com.swms.locpostingmoduleV1.util.Resource


interface PalletPutawayRepository {
    suspend fun fetchLocationCode(token : String,scannedLoc: String) : Resource<ResponseLocationCode>
    suspend fun fetchMappedToPallet(token : String,id : Int) : Resource<ResponseMappedToPallet>
    suspend fun fetchResponseFromPalletTransfer(token : String,dataset : InputMappedtoPallet): Resource<ResponsePutawayPalletTransfer>
}