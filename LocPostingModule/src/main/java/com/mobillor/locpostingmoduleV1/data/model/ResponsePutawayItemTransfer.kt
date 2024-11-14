package com.mobillor.locpostingmoduleV1.data.model

data class ResponsePutawayItemTransfer(
    val `data`: Data,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
) {
    data class Data(
        val asnCode: String?,
        val batchNumber: String?,
        val grnLineNumber: String?,
        val grnNumber: String?,
        val itemCode: String?,
        val itemDescription: String?,
        val itemId: Int?,
        val locationCode: String?,
        val locationId: Int?,
        val qty: Double?,
        val sku: String?,
        val suid: String?,
        val uom: String?
    )
}