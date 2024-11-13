package com.mobillor.locpostingmodule.domain.useCase


import com.mobillor.locpostingmodule.data.model.ResponseMappedToPallet
import com.mobillor.locpostingmodule.domain.repository.PalletPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class GetMappedToPalletUseCase(private val repository: PalletPutawayRepository) {
suspend operator fun invoke(token : String,id : Int) : Resource<ResponseMappedToPallet> {
    return repository.fetchMappedToPallet(token,id)
}
}