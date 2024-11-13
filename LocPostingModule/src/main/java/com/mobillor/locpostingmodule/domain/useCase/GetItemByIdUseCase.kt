package com.mobillor.locpostingmodule.domain.useCase


import com.mobillor.locpostingmodule.domain.repository.PalletScanRepository
import com.mobillor.locpostingmodule.data.model.ResponseItemInfo
import com.mobillor.locpostingmodule.util.Resource

class GetItemByIdUseCase(private val repository: PalletScanRepository) {
    suspend operator fun invoke(token : String,scannedId : String): Resource<ResponseItemInfo> {
        return repository.getItemById(token,scannedId)
    }
}