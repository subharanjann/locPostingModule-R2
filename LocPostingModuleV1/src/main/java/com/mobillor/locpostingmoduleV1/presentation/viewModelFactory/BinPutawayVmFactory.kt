package com.mobillor.locpostingmoduleV1.presentation.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobillor.locpostingmoduleV1.domain.useCase.GetLocationUseCase
import com.mobillor.locpostingmoduleV1.domain.useCase.GetMappedToBinUseCase
import com.mobillor.locpostingmoduleV1.domain.useCase.GetPalletLocationUseCase
import com.mobillor.locpostingmoduleV1.domain.useCase.PutawayBinUseCase
import com.mobillor.locpostingmoduleV1.presentation.viewModel.BinPutawayCompletionVm

class BinPutawayVmFactory(
    private val getLocationUseCase: GetLocationUseCase,
    private val getPalletLocationUseCase: GetPalletLocationUseCase,
    private val mappedToBinUseCase: GetMappedToBinUseCase,
    private val putawayBinUseCase : PutawayBinUseCase
):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>):T{
        if(modelClass.isAssignableFrom(BinPutawayCompletionVm::class.java)){
            return  BinPutawayCompletionVm(getLocationUseCase,getPalletLocationUseCase,mappedToBinUseCase,putawayBinUseCase) as T
        }
        throw IllegalArgumentException("Unknown viewModel CLass")
    }
}