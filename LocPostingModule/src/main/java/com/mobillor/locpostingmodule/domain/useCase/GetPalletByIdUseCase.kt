package com.mobillor.locpostingmodule.domain.useCase

import com.mobillor.locpostingmodule.data.model.ResponsePalletInfo
import com.mobillor.locpostingmodule.domain.repository.PalletScanRepository
import com.mobillor.locpostingmodule.util.Resource


class GetPalletByIdUseCase(private val repository: PalletScanRepository) {
    suspend operator fun invoke(token : String,scannedId : String): Resource<ResponsePalletInfo> {
        return repository.getPalletById(token,scannedId)
    }
}