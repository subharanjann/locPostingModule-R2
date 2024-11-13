package com.mobillor.locpostingmodule.presentation.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.mobillor.locpostingmodule.domain.useCase.GetLocationUseCase
import com.mobillor.locpostingmodule.domain.useCase.GetMappedToBinUseCase
import com.mobillor.locpostingmodule.domain.useCase.GetPalletLocationUseCase
import com.mobillor.locpostingmodule.domain.useCase.PutawayBinUseCase
import com.mobillor.locpostingmodule.data.model.InputMappedtoBin
import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.data.model.ResponseMappedToBin
import com.mobillor.locpostingmodule.data.model.ResponsePalletCode
import com.mobillor.locpostingmodule.data.model.ResponsePutawayBinTransfer
import com.mobillor.locpostingmodule.util.Resource

import kotlinx.coroutines.launch

class BinPutawayCompletionVm(
    private val getLocationUseCase: GetLocationUseCase,
    private val getPalletLocationUseCase: GetPalletLocationUseCase,
    private val mappedToBinUseCase: GetMappedToBinUseCase,
    private val putawayBinUseCase: PutawayBinUseCase
):ViewModel() {
    private val _locationDataResponseLiveData = MutableLiveData<Resource<ResponseLocationCode>>()
        val locationDataResponseLiveData: LiveData<Resource<ResponseLocationCode>> get() = _locationDataResponseLiveData
    private val _palletCodeResponseLiveData = MutableLiveData<Resource<ResponsePalletCode>> ()
        val palletCodeResponseLiveData : LiveData<Resource<ResponsePalletCode>> get() = _palletCodeResponseLiveData
    private val _mappedtoBin = MutableLiveData<Resource<ResponseMappedToBin>>()
        val mappedtoBin : LiveData<Resource<ResponseMappedToBin>> get() =_mappedtoBin
    private val _binPutawayResponseLiveData = MutableLiveData<Resource<ResponsePutawayBinTransfer>>()
        val binPutawayResponseLiveData : LiveData<Resource<ResponsePutawayBinTransfer>> get() = _binPutawayResponseLiveData



    fun getLocationCode(token : String, scannedloc : String){
        viewModelScope.launch {
            val result  = getLocationUseCase(token ,scannedloc)
            _locationDataResponseLiveData.postValue(result)
        }
    }

    fun  getPalletCode(token : String,scannedPallet: String){
        viewModelScope.launch {
            val result =getPalletLocationUseCase(token,scannedPallet)
            _palletCodeResponseLiveData.postValue(result)
        }
    }

    fun getMappedtoBinData(token : String,id : Int){
        viewModelScope.launch {
            val result = mappedToBinUseCase(token,id)
            _mappedtoBin.postValue(result)
        }
    }

    fun binLocationTransfer(token : String,dataSet : InputMappedtoBin){
        viewModelScope.launch {
            val result =putawayBinUseCase(token,dataSet)
            _binPutawayResponseLiveData.postValue(result)
        }
    }




}
