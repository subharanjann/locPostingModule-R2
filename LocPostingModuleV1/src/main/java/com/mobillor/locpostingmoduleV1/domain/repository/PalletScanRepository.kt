package com.mobillor.locpostingmoduleV1.domain.repository

import com.mobillor.locpostingmoduleV1.data.model.ResponseBinInfo
import com.mobillor.locpostingmoduleV1.data.model.ResponseItemInfo
import com.mobillor.locpostingmoduleV1.data.model.ResponsePalletInfo
import com.mobillor.locpostingmoduleV1.util.Resource


interface PalletScanRepository {
 suspend fun   getPalletById(token : String,scannedId : String): Resource<ResponsePalletInfo>
 suspend fun   getBinById(token : String,scannedId : String):Resource<ResponseBinInfo>
 suspend fun   getItemById(token : String,scannedId : String):Resource<ResponseItemInfo>



}