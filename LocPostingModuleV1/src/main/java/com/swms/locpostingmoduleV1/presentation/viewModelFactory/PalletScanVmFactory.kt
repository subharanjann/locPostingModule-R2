package com.swms.locpostingmoduleV1.presentation.viewModelFactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.swms.locpostingmoduleV1.domain.useCase.GetItemByIdUseCase
import com.swms.locpostingmoduleV1.domain.useCase.GetPalletByIdUseCase
import com.swms.locpostingmoduleV1.presentation.viewModel.PalletScanVm
import com.swms.locpostingmoduleV1.domain.useCase.GetBinByIdUseCase

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