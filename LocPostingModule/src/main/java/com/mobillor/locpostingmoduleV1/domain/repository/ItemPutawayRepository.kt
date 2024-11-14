package com.mobillor.locpostingmoduleV1.domain.repository

import com.mobillor.locpostingmoduleV1.data.model.InputMappedtoItem
import com.mobillor.locpostingmoduleV1.data.model.ResponseBinCode
import com.mobillor.locpostingmoduleV1.data.model.ResponseLocationCode
import com.mobillor.locpostingmoduleV1.data.model.ResponsePalletCode
import com.mobillor.locpostingmoduleV1.data.model.ResponsePutawayItemTransfer
import com.mobillor.locpostingmoduleV1.util.Resource


interface ItemPutawayRepository {
    suspend fun fetchLocationCode(token : String,scannedLoc: String): Resource<ResponseLocationCode>
    suspend fun fetchPalletCode(token : String,scannedpallet : String):Resource<ResponsePalletCode>
    suspend fun fetchBinCode (token : String,scannedBin : String):Resource<ResponseBinCode>
    suspend fun fetchResponseFromItemTransfer(token : String,dataSet : InputMappedtoItem):Resource<ResponsePutawayItemTransfer>
}