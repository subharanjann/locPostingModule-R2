package com.mobillor.locpostingmodule.data.model

data class InputMappedtoPallet(
    var locationId: Int = 555,
    var pallets: List<Pallet>,
    var sourceLocation: Int =555,
    var userId: String
) {
    data class Pallet(
        var palletId: Int = 555
    )
}