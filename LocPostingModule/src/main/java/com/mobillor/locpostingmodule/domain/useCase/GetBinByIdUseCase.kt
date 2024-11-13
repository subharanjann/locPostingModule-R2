package com.mobillor.locpostingmodule.domain.useCase


import com.mobillor.locpostingmodule.data.model.ResponseBinInfo
import com.mobillor.locpostingmodule.domain.repository.PalletScanRepository
import com.mobillor.locpostingmodule.util.Resource


class GetBinByIdUseCase(private val repository: PalletScanRepository) {
    suspend operator fun invoke(token : String,scannedId : String): Resource<ResponseBinInfo> {
        return repository.getBinById(token,scannedId)
    }
}