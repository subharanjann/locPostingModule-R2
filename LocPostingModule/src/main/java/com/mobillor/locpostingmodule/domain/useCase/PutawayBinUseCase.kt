package com.mobillor.locpostingmodule.domain.useCase

import com.mobillor.locpostingmodule.data.model.InputMappedtoBin
import com.mobillor.locpostingmodule.data.model.ResponsePutawayBinTransfer
import com.mobillor.locpostingmodule.domain.repository.BinPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class PutawayBinUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke(token: String, dataSet: InputMappedtoBin): Resource<ResponsePutawayBinTransfer> {
        return repository.fetchResponseFromBinTransfer(token,dataSet)
    }
}