package com.mobillor.locpostingmodule.domain.useCase

import com.mobillor.locpostingmodule.data.model.InputMappedtoPallet
import com.mobillor.locpostingmodule.data.model.ResponsePutawayPalletTransfer
import com.mobillor.locpostingmodule.domain.repository.PalletPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class PutawayPalletUseCase(private val repository: PalletPutawayRepository) {
    suspend operator fun invoke(token : String,dataset : InputMappedtoPallet) : Resource<ResponsePutawayPalletTransfer> {
        return repository.fetchResponseFromPalletTransfer(token,dataset)
    }
}