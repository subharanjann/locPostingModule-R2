package com.mobillor.locpostingmodule.domain.useCase

import com.mobillor.locpostingmodule.data.model.ResponseMappedToBin
import com.mobillor.locpostingmodule.domain.repository.BinPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class GetMappedToBinUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke(token: String, id: Int): Resource<ResponseMappedToBin> {
        return repository.fetchMappedtoBin(token,id)
    }
}