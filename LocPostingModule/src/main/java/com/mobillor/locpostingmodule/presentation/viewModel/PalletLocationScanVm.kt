package com.mobillor.locpostingmodule.presentation.viewModel

//import android.app.Application
//import androidx.lifecycle.AndroidViewModel
//import androidx.lifecycle.LiveData
//import com.gimble.segmk3.data.remote.models.locationPostingModule.InputMappedtoPallet
//import com.gimble.segmk3.data.remote.models.locationPostingModule.ResponseLocationCode
//import com.gimble.segmk3.data.remote.models.locationPostingModule.ResponseMappedToPallet
//import com.gimble.segmk3.data.remote.models.locationPostingModule.ResponsePutawayPalletTransfer
//import com.gimble.segmk3.data.remote.repositories.locationPostingRepo.PalletLocationScanRepository
//
//class PalletLocationScanVm(application: Application) : AndroidViewModel(application) {
//    val repository: PalletLocationScanRepository = PalletLocationScanRepository(application)
//    val locationDataResponseLiveData: LiveData<ResponseLocationCode> get() = repository.locationDataResponseLiveData
//
//    val mappedToPalletResponseLiveData : LiveData<ResponseMappedToPallet> get() = repository.mappedPalletResonseLiveData
//
//    val putawayPalletTransferResponseLiveData : LiveData<ResponsePutawayPalletTransfer>get() = repository.palletTransferResponseLiveData
//    fun getLocationCode(scannedLoc: String) {
//        repository.fetchLocationCode(scannedLoc)
//    }
//
//    fun getMappedToPallet(id : Int){
//        repository.fetchMappedToPallet(id)
//    }
//    fun putawayPallet(dataSet : InputMappedtoPallet){
//        repository.fetchResponseFromPalletTransfer(dataSet)
//    }
//
//}