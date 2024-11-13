package com.mobillor.locpostingmodule.presentation.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobillor.locpostingmodule.domain.useCase.GetBinLocationUseCase
import com.mobillor.locpostingmodule.domain.useCase.GetLocationUseCase
import com.mobillor.locpostingmodule.domain.useCase.GetPalletLocationUseCase
import com.mobillor.locpostingmodule.domain.useCase.PutawayItemUseCase
import com.mobillor.locpostingmodule.presentation.viewModel.ItemPutawayCompletionVm

class ItemPutawayVmFactory(
    private val getLocationUseCase : GetLocationUseCase,
    private val getPalletLocationUseCase: GetPalletLocationUseCase,
    private val getBinLocationUseCase: GetBinLocationUseCase,
    private val putawayItemUseCase: PutawayItemUseCase
): ViewModelProvider.Factory {
    override fun <T :ViewModel> create(modelClass: Class<T>):T{
        if (modelClass.isAssignableFrom(ItemPutawayCompletionVm::class.java)){
            return ItemPutawayCompletionVm(getLocationUseCase,getPalletLocationUseCase,getBinLocationUseCase,putawayItemUseCase) as T
        }
        throw IllegalArgumentException("unknown viewModel")
    }
}