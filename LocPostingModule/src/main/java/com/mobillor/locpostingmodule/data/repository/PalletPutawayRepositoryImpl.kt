package com.mobillor.locpostingmodule.data.repository

import android.util.Log
import com.mobillor.locpostingmodule.domain.repository.PalletPutawayRepository
import com.mobillor.locpostingmodule.data.apiService.LocationPostingApiInterface
import com.mobillor.locpostingmodule.data.model.InputMappedtoPallet
import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.data.model.ResponseMappedToPallet
import com.mobillor.locpostingmodule.data.model.ResponsePutawayPalletTransfer
import com.mobillor.locpostingmodule.util.Resource
import retrofit2.HttpException

class PalletPutawayRepositoryImpl(private val apiService : LocationPostingApiInterface):
    PalletPutawayRepository {
    override suspend fun fetchLocationCode(
        token: String,
        scannedLoc: String
    ): Resource<ResponseLocationCode> {
        return try {
            val myData = apiService.getLocationCode(scannedLoc)
            if (myData.isSuccessful) {
                val updateInfo = myData.body()
                if (updateInfo != null) {
                    Resource.Success(updateInfo)
                } else {
                    return   Resource.Error("Update information not available")
                }
            } else {
                val errorMessage = myData.errorBody()?.string()
                return   Resource.Error(errorMessage ?: "Failed to fetch update information")
            }
        } catch (e: HttpException) {
            return Resource.Error("HttpException: ${e.code()} ${e.message()}")
        } catch (e: Exception) {
            Log.e("tag Exception ", e.message.toString())
            return  Resource.Error(e.message ?: "An error occurred")

        }
    }

    override suspend fun fetchMappedToPallet(
        token: String,
        id: Int
    ): Resource<ResponseMappedToPallet> {
        return try {
            val myData = apiService.getMaterialsMappedToPalletByPalletId(id)
            if (myData.isSuccessful) {
                val updateInfo = myData.body()
                if (updateInfo != null) {
                    Resource.Success(updateInfo)
                } else {
                    return   Resource.Error("Update information not available")
                }
            } else {
                val errorMessage = myData.errorBody()?.string()
                return   Resource.Error(errorMessage ?: "Failed to fetch update information")
            }
        } catch (e: HttpException) {
            return Resource.Error("HttpException: ${e.code()} ${e.message()}")
        } catch (e: Exception) {
            Log.e("tag Exception ", e.message.toString())
            return  Resource.Error(e.message ?: "An error occurred")

        }
    }

    override suspend fun fetchResponseFromPalletTransfer(
        token: String,
        dataset: InputMappedtoPallet
    ): Resource<ResponsePutawayPalletTransfer> {
        return try {
            val myData = apiService.palletTransferLocation(dataset)
            if (myData.isSuccessful) {
                val updateInfo = myData.body()
                if (updateInfo != null) {
                    Resource.Success(updateInfo)
                } else {
                    return   Resource.Error("Update information not available")
                }
            } else {
                val errorMessage = myData.errorBody()?.string()
                return   Resource.Error(errorMessage ?: "Failed to fetch update information")
            }
        } catch (e: HttpException) {
            return Resource.Error("HttpException: ${e.code()} ${e.message()}")
        } catch (e: Exception) {
            Log.e("tag Exception ", e.message.toString())
            return  Resource.Error(e.message ?: "An error occurred")

        }
    }
}