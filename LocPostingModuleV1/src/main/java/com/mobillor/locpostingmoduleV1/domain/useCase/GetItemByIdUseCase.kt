package com.mobillor.locpostingmoduleV1.domain.useCase


import com.mobillor.locpostingmoduleV1.domain.repository.PalletScanRepository
import com.mobillor.locpostingmoduleV1.data.model.ResponseItemInfo
import com.mobillor.locpostingmoduleV1.util.Resource

class GetItemByIdUseCase(private val repository: PalletScanRepository) {
    suspend operator fun invoke(token : String,scannedId : String): Resource<ResponseItemInfo> {
        return repository.getItemById(token,scannedId)
    }
}