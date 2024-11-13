package com.mobillor.locpostingmodule.domain.repository

import com.mobillor.locpostingmodule.data.model.InputMappedtoBin
import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.data.model.ResponseMappedToBin
import com.mobillor.locpostingmodule.data.model.ResponsePalletCode
import com.mobillor.locpostingmodule.data.model.ResponsePutawayBinTransfer
import com.mobillor.locpostingmodule.util.Resource


interface BinPutawayRepository {
    suspend fun fetchLocationCode(token:String,scannedLoc: String): Resource<ResponseLocationCode>
    suspend fun fetchPalletCode(token:String,scannedpallet : String):Resource<ResponsePalletCode>
    suspend fun fetchMappedtoBin(token:String,id : Int):Resource<ResponseMappedToBin>
    suspend fun fetchResponseFromBinTransfer(token:String,dataSet : InputMappedtoBin):Resource<ResponsePutawayBinTransfer>
}