package com.swms.locpostingmoduleV1.domain.useCase

import com.swms.locpostingmoduleV1.data.model.InputMappedtoItem
import com.swms.locpostingmoduleV1.data.model.ResponsePutawayItemTransfer
import com.swms.locpostingmoduleV1.domain.repository.ItemPutawayRepository
import com.swms.locpostingmoduleV1.util.Resource


class PutawayItemUseCase(private val repository: ItemPutawayRepository) {
    suspend operator fun invoke(token : String,dataSet : InputMappedtoItem): Resource<ResponsePutawayItemTransfer> {
        return repository.fetchResponseFromItemTransfer(token,dataSet)
    }
}