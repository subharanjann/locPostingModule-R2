package com.mobillor.locpostingmoduleV1.data.model

data class InputMappedtoBin(
    var bins: List<Bin>,
    var locationId: Int,
    var sourceLocation: Int,
    var userId: String
) {
    data class Bin(
        var binId: Int,
        var palletId: Int
    )
}