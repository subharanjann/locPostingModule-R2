package com.swms.locpostingmoduleV1.domain.useCase


import com.swms.locpostingmoduleV1.domain.repository.PalletScanRepository
import com.swms.locpostingmoduleV1.data.model.ResponseItemInfo
import com.swms.locpostingmoduleV1.util.Resource

class GetItemByIdUseCase(private val repository: PalletScanRepository) {
    suspend operator fun invoke(token : String,scannedId : String): Resource<ResponseItemInfo> {
        return repository.getItemById(token,scannedId)
    }
}