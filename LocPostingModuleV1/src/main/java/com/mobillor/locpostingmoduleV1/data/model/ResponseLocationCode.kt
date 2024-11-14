package com.mobillor.locpostingmoduleV1.data.model
import java.io.Serializable
data class ResponseLocationCode(
    val `data`: List<Data>,
    val msg: String,
    val status: Boolean,
    val statusCode: Int
): Serializable {
    data class Data(
        val locationCode: String?,
        val locationId: Int?,
        val locationName: String?
    ) : Serializable
}