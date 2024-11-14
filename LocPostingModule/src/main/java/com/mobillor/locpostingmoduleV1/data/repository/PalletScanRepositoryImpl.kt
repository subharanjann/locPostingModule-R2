package com.mobillor.locpostingmoduleV1.data.repository

import android.util.Log
import com.mobillor.locpostingmoduleV1.domain.repository.PalletScanRepository
import com.mobillor.locpostingmoduleV1.data.apiService.LocationPostingApiInterface
import com.mobillor.locpostingmoduleV1.data.model.ResponseBinInfo
import com.mobillor.locpostingmoduleV1.data.model.ResponseItemInfo
import com.mobillor.locpostingmoduleV1.data.model.ResponsePalletInfo
import com.mobillor.locpostingmoduleV1.util.Resource

import retrofit2.HttpException

class PalletScanRepositoryImpl(private val apiService : LocationPostingApiInterface):
    PalletScanRepository {
    override suspend fun getPalletById(token: String, scannedId: String): Resource<ResponsePalletInfo> {
        return try {

                val myData = apiService.getPalletWithId(token,scannedId)
                if (myData.isSuccessful) {
                    val updateInfo = myData.body()
                    if (updateInfo != null) {
                        Resource.Success(updateInfo)
                    } else {
                        return  Resource.Error("Update information not available")
                    }
                } else {
                    val errorMessage = myData.errorBody()?.string()
                    return Resource.Error(errorMessage ?: "Failed to fetch update information")
                }
        } catch (e: HttpException) {
            return Resource.Error("HttpException: ${e.code()} ${e.message()}")
        } catch (e: Exception) {
            Log.e("tag Exception ", e.message.toString())
            return Resource.Error(e.message ?: "An error occurred")
        }
    }

    override suspend fun getBinById(token: String, scannedId: String): Resource<ResponseBinInfo> {
        return try {
            val myData = apiService.getBinWithId(token, scannedId)
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

    override suspend fun getItemById(token: String, scannedId: String): Resource<ResponseItemInfo> {
        return try {
            val myData = apiService.getItemWithId(token, scannedId)
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