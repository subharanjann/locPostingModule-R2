package com.mobillor.locpostingmodule.domain.useCase


import com.mobillor.locpostingmodule.data.model.ResponseBinCode
import com.mobillor.locpostingmodule.domain.repository.ItemPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class GetBinLocationUseCase(private val repository: ItemPutawayRepository) {
    suspend operator fun invoke(token : String,scannedBin : String): Resource<ResponseBinCode> {
        return repository.fetchBinCode(token,scannedBin)
    }
}