package com.swms.locpostingmoduleV1.presentation.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.swms.locpostingmoduleV1.domain.useCase.GetLocationUseCase
import com.swms.locpostingmoduleV1.domain.useCase.GetMappedToPalletUseCase
import com.swms.locpostingmoduleV1.domain.useCase.PutawayPalletUseCase
import com.swms.locpostingmoduleV1.presentation.viewModel.PalletPutawayCompletionVm

class PalletPutawayVmFactory(
    private val getLocationUseCase: GetLocationUseCase,
    private val getMappedToPalletUseCase: GetMappedToPalletUseCase,
    private val putawayPalletUseCase: PutawayPalletUseCase
): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T{
        if(modelClass.isAssignableFrom(PalletPutawayCompletionVm::class.java)){
            return PalletPutawayCompletionVm(getLocationUseCase,getMappedToPalletUseCase,putawayPalletUseCase) as T}
        throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
