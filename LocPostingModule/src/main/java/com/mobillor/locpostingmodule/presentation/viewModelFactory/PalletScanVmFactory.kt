package com.mobillor.locpostingmodule.presentation.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mobillor.locpostingmodule.domain.useCase.GetItemByIdUseCase
import com.mobillor.locpostingmodule.domain.useCase.GetPalletByIdUseCase
import com.mobillor.locpostingmodule.presentation.viewModel.PalletScanVm
import com.mobillor.locpostingmodule.domain.useCase.GetBinByIdUseCase

class PalletScanVmFactory(
    private val getPalletByIdUseCase: GetPalletByIdUseCase,
    private val getBinByIdUseCase: GetBinByIdUseCase,
    private val getItemByIdUseCase: GetItemByIdUseCase
):ViewModelProvider.Factory
{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(PalletScanVm::class.java)) {
        return PalletScanVm(getPalletByIdUseCase,getBinByIdUseCase,getItemByIdUseCase) as T}
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}