package com.mobillor.locpostingmodule.data.model

data class InputMappedtoItem(
    var locationId: Int,
    var suids: List<Suid>,
    var userId: String
) {
    data class Suid(
        var binId: Int,
        var palletId: Int,
        var srcLocationId: Int,
        var suid: String
    )
}