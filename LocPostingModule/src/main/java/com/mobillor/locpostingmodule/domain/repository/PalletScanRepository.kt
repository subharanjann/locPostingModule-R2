package com.mobillor.locpostingmodule.domain.repository

import com.mobillor.locpostingmodule.data.model.ResponseBinInfo
import com.mobillor.locpostingmodule.data.model.ResponseItemInfo
import com.mobillor.locpostingmodule.data.model.ResponsePalletInfo
import com.mobillor.locpostingmodule.util.Resource


interface PalletScanRepository {
 suspend fun   getPalletById(token : String,scannedId : String): Resource<ResponsePalletInfo>
 suspend fun   getBinById(token : String,scannedId : String):Resource<ResponseBinInfo>
 suspend fun   getItemById(token : String,scannedId : String):Resource<ResponseItemInfo>



}