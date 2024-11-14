package com.mobillor.locpostingmoduleV1.domain.useCase

import com.mobillor.locpostingmoduleV1.data.model.ResponsePalletInfo
import com.mobillor.locpostingmoduleV1.domain.repository.PalletScanRepository
import com.mobillor.locpostingmoduleV1.util.Resource


class GetPalletByIdUseCase(private val repository: PalletScanRepository) {
    suspend operator fun invoke(token : String,scannedId : String): Resource<ResponsePalletInfo> {
        return repository.getPalletById(token,scannedId)
    }
}