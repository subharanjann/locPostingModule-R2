package com.mobillor.locpostingmoduleV1.domain.useCase

import com.mobillor.locpostingmoduleV1.data.model.ResponseMappedToBin
import com.mobillor.locpostingmoduleV1.domain.repository.BinPutawayRepository
import com.mobillor.locpostingmoduleV1.util.Resource


class GetMappedToBinUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke(token: String, id: Int): Resource<ResponseMappedToBin> {
        return repository.fetchMappedtoBin(token,id)
    }
}