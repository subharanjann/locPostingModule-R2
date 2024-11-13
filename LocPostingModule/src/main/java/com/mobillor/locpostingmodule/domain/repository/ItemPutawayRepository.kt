package com.mobillor.locpostingmodule.domain.repository

import com.mobillor.locpostingmodule.data.model.InputMappedtoItem
import com.mobillor.locpostingmodule.data.model.ResponseBinCode
import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.data.model.ResponsePalletCode
import com.mobillor.locpostingmodule.data.model.ResponsePutawayItemTransfer
import com.mobillor.locpostingmodule.util.Resource


interface ItemPutawayRepository {
    suspend fun fetchLocationCode(token : String,scannedLoc: String): Resource<ResponseLocationCode>
    suspend fun fetchPalletCode(token : String,scannedpallet : String):Resource<ResponsePalletCode>
    suspend fun fetchBinCode (token : String,scannedBin : String):Resource<ResponseBinCode>
    suspend fun fetchResponseFromItemTransfer(token : String,dataSet : InputMappedtoItem):Resource<ResponsePutawayItemTransfer>
}