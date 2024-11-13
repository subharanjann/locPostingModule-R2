package com.mobillor.locpostingmodule.data.model

import java.io.Serializable

data class ResponsePalletInfo(
    val `data`: List<DataResponsePalletInfo>,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
): Serializable {

}
data class DataResponsePalletInfo(
    val cd: String?,
    val cdBy: String,
    val isActive: Int,
    val isDeleted: Int,
    val isEmpty: Int,
    val palletCode: String?,
    val palletId: Int?,
    val palletName: String?,
    val palletTypeId: Int,
    val ud: String,
    val udBy: String,
    var localSelectionValue : Int = 0
): Serializable