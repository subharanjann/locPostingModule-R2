package com.mobillor.locpostingmoduleV1.domain.useCase


import com.mobillor.locpostingmoduleV1.data.model.ResponsePalletCode
import com.mobillor.locpostingmoduleV1.domain.repository.BinPutawayRepository
import com.mobillor.locpostingmoduleV1.util.Resource


class GetPalletLocationUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke   (token: String, scannedpallet: String): Resource<ResponsePalletCode> {
        return repository.fetchPalletCode(token,scannedpallet)
    }
}