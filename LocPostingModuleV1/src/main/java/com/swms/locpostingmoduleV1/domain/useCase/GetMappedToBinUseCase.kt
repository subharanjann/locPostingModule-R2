package com.swms.locpostingmoduleV1.domain.useCase

import com.swms.locpostingmoduleV1.data.model.ResponseMappedToBin
import com.swms.locpostingmoduleV1.domain.repository.BinPutawayRepository
import com.swms.locpostingmoduleV1.util.Resource


class GetMappedToBinUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke(token: String, id: Int): Resource<ResponseMappedToBin> {
        return repository.fetchMappedtoBin(token,id)
    }
}