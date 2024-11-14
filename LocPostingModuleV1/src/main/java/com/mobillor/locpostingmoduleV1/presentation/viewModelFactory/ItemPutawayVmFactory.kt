package com.mobillor.locpostingmoduleV1.presentation.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobillor.locpostingmoduleV1.domain.useCase.GetBinLocationUseCase
import com.mobillor.locpostingmoduleV1.domain.useCase.GetLocationUseCase
import com.mobillor.locpostingmoduleV1.domain.useCase.GetPalletLocationUseCase
import com.mobillor.locpostingmoduleV1.domain.useCase.PutawayItemUseCase
import com.mobillor.locpostingmoduleV1.presentation.viewModel.ItemPutawayCompletionVm

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