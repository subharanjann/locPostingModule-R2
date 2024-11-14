package com.mobillor.locpostingmoduleV1.domain.useCase

import com.mobillor.locpostingmoduleV1.data.model.InputMappedtoBin
import com.mobillor.locpostingmoduleV1.data.model.ResponsePutawayBinTransfer
import com.mobillor.locpostingmoduleV1.domain.repository.BinPutawayRepository
import com.mobillor.locpostingmoduleV1.util.Resource


class PutawayBinUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke(token: String, dataSet: InputMappedtoBin): Resource<ResponsePutawayBinTransfer> {
        return repository.fetchResponseFromBinTransfer(token,dataSet)
    }
}