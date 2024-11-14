package com.swms.locpostingmoduleV1.domain.useCase


import com.swms.locpostingmoduleV1.data.model.ResponseMappedToPallet
import com.swms.locpostingmoduleV1.domain.repository.PalletPutawayRepository
import com.swms.locpostingmoduleV1.util.Resource


class GetMappedToPalletUseCase(private val repository: PalletPutawayRepository) {
suspend operator fun invoke(token : String,id : Int) : Resource<ResponseMappedToPallet> {
    return repository.fetchMappedToPallet(token,id)
}
}