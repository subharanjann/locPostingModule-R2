package com.mobillor.locpostingmodule.domain.useCase

import com.mobillor.locpostingmodule.data.model.InputMappedtoItem
import com.mobillor.locpostingmodule.data.model.ResponsePutawayItemTransfer
import com.mobillor.locpostingmodule.domain.repository.ItemPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class PutawayItemUseCase(private val repository: ItemPutawayRepository) {
    suspend operator fun invoke(token : String,dataSet : InputMappedtoItem): Resource<ResponsePutawayItemTransfer> {
        return repository.fetchResponseFromItemTransfer(token,dataSet)
    }
}