package com.swms.locpostingmoduleV1.domain.useCase

import com.swms.locpostingmoduleV1.data.model.InputMappedtoPallet
import com.swms.locpostingmoduleV1.data.model.ResponsePutawayPalletTransfer
import com.swms.locpostingmoduleV1.domain.repository.PalletPutawayRepository
import com.swms.locpostingmoduleV1.util.Resource


class PutawayPalletUseCase(private val repository: PalletPutawayRepository) {
    suspend operator fun invoke(token : String,dataset : InputMappedtoPallet) : Resource<ResponsePutawayPalletTransfer> {
        return repository.fetchResponseFromPalletTransfer(token,dataset)
    }
}