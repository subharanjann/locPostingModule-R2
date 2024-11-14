package com.mobillor.locpostingmoduleV1.data.model
import java.io.Serializable
data class ResponseItemInfo(
    val `data`: List<DataResponseItemInfo>,
    val location: String,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
) :Serializable{

}
data class DataResponseItemInfo(
    val asnCode: String?,
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
    val uom: String?,
    var localSelectionValue: Int = 0
):Serializable {

}