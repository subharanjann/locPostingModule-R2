package com.swms.locpostingmoduleV1.data.model

data class ResponseBinCode(
    val `data`: List<Data>,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
) {
    data class Data(
        val binCode: String?,
        val binId: Int?,
        val binType: String?,
        val cd: String,
        val isActive: Int,
        val isDeleted: Int,
        val isEmpty: Int,
        val ud: Any
    )
}