package com.swms.locpostingmoduleV1.domain.useCase


import com.swms.locpostingmoduleV1.data.model.ResponseBinCode
import com.swms.locpostingmoduleV1.domain.repository.ItemPutawayRepository
import com.swms.locpostingmoduleV1.util.Resource


class GetBinLocationUseCase(private val repository: ItemPutawayRepository) {
    suspend operator fun invoke(token : String,scannedBin : String): Resource<ResponseBinCode> {
        return repository.fetchBinCode(token,scannedBin)
    }
}