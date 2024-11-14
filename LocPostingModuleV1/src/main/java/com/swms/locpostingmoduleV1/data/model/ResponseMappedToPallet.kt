package com.swms.locpostingmoduleV1.data.model

import java.io.Serializable

data class ResponseMappedToPallet(
    val `data`: List<DataResponseMappedToPallet>,
    val location: String,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
):Serializable {

}
data class DataResponseMappedToPallet(
    val asnCode: String?,
    val batchNumber: String?,
    val grnLineNumber: String?,
    val grnNumber: String?,
    val itemCode: String?,
    val itemDescription: String?,
    val itemId: Int,
    val locationCode: String,
    val locationId: Int,
    val palletId: String?,
    val qty: Double?,
    val sku: String?,
    val suid: String?,
    val uom: String?
):Serializable