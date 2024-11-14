package com.swms.locpostingmoduleV1.presentation.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.swms.locpostingmoduleV1.domain.useCase.GetBinLocationUseCase
import com.swms.locpostingmoduleV1.domain.useCase.GetLocationUseCase
import com.swms.locpostingmoduleV1.domain.useCase.GetPalletLocationUseCase
import com.swms.locpostingmoduleV1.domain.useCase.PutawayItemUseCase
import com.swms.locpostingmoduleV1.presentation.viewModel.ItemPutawayCompletionVm

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