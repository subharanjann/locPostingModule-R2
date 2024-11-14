package com.swms.locpostingmoduleV1.domain.repository

import com.swms.locpostingmoduleV1.data.model.ResponseBinInfo
import com.swms.locpostingmoduleV1.data.model.ResponseItemInfo
import com.swms.locpostingmoduleV1.data.model.ResponsePalletInfo
import com.swms.locpostingmoduleV1.util.Resource


interface PalletScanRepository {
 suspend fun   getPalletById(token : String,scannedId : String): Resource<ResponsePalletInfo>
 suspend fun   getBinById(token : String,scannedId : String):Resource<ResponseBinInfo>
 suspend fun   getItemById(token : String,scannedId : String):Resource<ResponseItemInfo>



}