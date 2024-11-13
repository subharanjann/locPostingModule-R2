package com.mobillor.locpostingmodule.data.model
import java.io.Serializable
data class ResponseBinInfo(
    val `data`: List<DataResponseBinInfo>,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
): Serializable {

}
data class DataResponseBinInfo(
    val binCode: String?,
    val binId: Int?,
    val binType: String?,
    val binName : String?,
    val cd: String?,
    val isActive: Int,
    val isDeleted: Int,
    val isEmpty: Int,
    val ud: Any?,
    var localSelectionValue : Int = 0
): Serializable