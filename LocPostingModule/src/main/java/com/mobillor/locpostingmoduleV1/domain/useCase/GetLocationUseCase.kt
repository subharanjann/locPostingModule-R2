package com.mobillor.locpostingmoduleV1.domain.useCase


import com.mobillor.locpostingmoduleV1.data.model.ResponseLocationCode
import com.mobillor.locpostingmoduleV1.domain.repository.PalletPutawayRepository
import com.mobillor.locpostingmoduleV1.util.Resource


class GetLocationUseCase(private val repository : PalletPutawayRepository) {
    suspend operator fun invoke(token : String,scannedLoc: String) : Resource<ResponseLocationCode> {
        return repository.fetchLocationCode(token,scannedLoc)
    }
}