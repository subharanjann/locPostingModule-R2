package com.mobillor.locpostingmodule.data.repository

import android.util.Log
import com.mobillor.locpostingmodule.domain.repository.BinPutawayRepository
import com.mobillor.locpostingmodule.data.apiService.LocationPostingApiInterface
import com.mobillor.locpostingmodule.data.model.InputMappedtoBin
import com.mobillor.locpostingmodule.data.model.ResponseLocationCode
import com.mobillor.locpostingmodule.data.model.ResponseMappedToBin
import com.mobillor.locpostingmodule.data.model.ResponsePalletCode
import com.mobillor.locpostingmodule.data.model.ResponsePutawayBinTransfer
import com.mobillor.locpostingmodule.util.Resource

import retrofit2.HttpException


class BinPutawayRepositoryImpl(private val apiService : LocationPostingApiInterface):
    BinPutawayRepository {
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

    override suspend fun fetchPalletCode(
        token: String,
        scannedpallet: String
    ): Resource<ResponsePalletCode> {
        return try {
            val myData = apiService.getPalletCode(scannedpallet)
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

    override suspend fun fetchMappedtoBin(token: String, id: Int): Resource<ResponseMappedToBin> {
        return try {
            val myData = apiService.getMaterialsMappedToBinByBinId(id)
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

    override suspend fun fetchResponseFromBinTransfer(
        token: String,
        dataSet: InputMappedtoBin
    ): Resource<ResponsePutawayBinTransfer> {
        return try {
            val myData = apiService.binTransferLocation(dataSet)
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