package com.mobillor.locpostingmoduleV1.data.model

data class ResponsePalletCode(
    val `data`: List<Data>,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
) {
    data class Data(
        val isActive: Int,
        val isEmpty: Int,
        val palletCode: String?,
        val palletId: Int?,
        val palletName: String?,
        val palletType: String?,
        val palletTypeId: Int
    )
}