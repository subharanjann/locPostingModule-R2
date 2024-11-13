package com.mobillor.locpostingmodule.domain.useCase


import com.mobillor.locpostingmodule.data.model.ResponsePalletCode
import com.mobillor.locpostingmodule.domain.repository.BinPutawayRepository
import com.mobillor.locpostingmodule.util.Resource


class GetPalletLocationUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke   (token: String, scannedpallet: String): Resource<ResponsePalletCode> {
        return repository.fetchPalletCode(token,scannedpallet)
    }
}