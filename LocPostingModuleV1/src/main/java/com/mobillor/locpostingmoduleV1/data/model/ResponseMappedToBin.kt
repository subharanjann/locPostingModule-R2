package com.mobillor.locpostingmoduleV1.data.model

data class ResponseMappedToBin(
    val `data`: List<DataResponseMappedToBin>,
    val location: String?,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
) {
    data class DataResponseMappedToBin(
        val asnCode: String?,
        val batchNumber: String?,
        val binCode: String?,
        val binId: Int?,
        val grnLineNumber: String?,
        val grnNumber: String?,
        val itemCode: String?,
        val itemDescription: String?,
        val itemId: Int,
        val locationCode: String?,
        val locationId: Int?,
        val qty: Double?,
        val sku: String?,
        val suid: String?,
        val uom: String?
    )
}