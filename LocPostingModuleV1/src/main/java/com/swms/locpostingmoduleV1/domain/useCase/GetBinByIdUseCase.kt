package com.swms.locpostingmoduleV1.domain.useCase


import com.swms.locpostingmoduleV1.data.model.ResponseBinInfo
import com.swms.locpostingmoduleV1.domain.repository.PalletScanRepository
import com.swms.locpostingmoduleV1.util.Resource


class GetBinByIdUseCase(private val repository: PalletScanRepository) {
    suspend operator fun invoke(token : String,scannedId : String): Resource<ResponseBinInfo> {
        return repository.getBinById(token,scannedId)
    }
}