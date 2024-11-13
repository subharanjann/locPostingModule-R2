package com.mobillor.locpostingmodule.domain.useCase


import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.domain.repository.PalletPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class GetLocationUseCase(private val repository : PalletPutawayRepository) {
    suspend operator fun invoke(token : String,scannedLoc: String) : Resource<ResponseLocationCode> {
        return repository.fetchLocationCode(token,scannedLoc)
    }
}