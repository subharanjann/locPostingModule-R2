package com.swms.locpostingmoduleV1.domain.useCase


import com.swms.locpostingmoduleV1.data.model.ResponsePalletCode
import com.swms.locpostingmoduleV1.domain.repository.BinPutawayRepository
import com.swms.locpostingmoduleV1.util.Resource


class GetPalletLocationUseCase(private val repository: BinPutawayRepository) {
    suspend operator fun invoke   (token: String, scannedpallet: String): Resource<ResponsePalletCode> {
        return repository.fetchPalletCode(token,scannedpallet)
    }
}