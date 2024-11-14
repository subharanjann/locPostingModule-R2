package com.swms.locpostingmoduleV1.domain.repository

import com.swms.locpostingmoduleV1.data.model.InputMappedtoBin
import com.swms.locpostingmoduleV1.data.model.ResponseLocationCode
import com.swms.locpostingmoduleV1.data.model.ResponseMappedToBin
import com.swms.locpostingmoduleV1.data.model.ResponsePalletCode
import com.swms.locpostingmoduleV1.data.model.ResponsePutawayBinTransfer
import com.swms.locpostingmoduleV1.util.Resource


interface BinPutawayRepository {
    suspend fun fetchLocationCode(token:String,scannedLoc: String): Resource<ResponseLocationCode>
    suspend fun fetchPalletCode(token:String,scannedpallet : String):Resource<ResponsePalletCode>
    suspend fun fetchMappedtoBin(token:String,id : Int):Resource<ResponseMappedToBin>
    suspend fun fetchResponseFromBinTransfer(token:String,dataSet : InputMappedtoBin):Resource<ResponsePutawayBinTransfer>
}