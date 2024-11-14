package com.mobillor.locpostingmoduleV1.domain.useCase

import com.mobillor.locpostingmoduleV1.data.model.InputMappedtoPallet
import com.mobillor.locpostingmoduleV1.data.model.ResponsePutawayPalletTransfer
import com.mobillor.locpostingmoduleV1.domain.repository.PalletPutawayRepository
import com.mobillor.locpostingmoduleV1.util.Resource


class PutawayPalletUseCase(private val repository: PalletPutawayRepository) {
    suspend operator fun invoke(token : String,dataset : InputMappedtoPallet) : Resource<ResponsePutawayPalletTransfer> {
        return repository.fetchResponseFromPalletTransfer(token,dataset)
    }
}