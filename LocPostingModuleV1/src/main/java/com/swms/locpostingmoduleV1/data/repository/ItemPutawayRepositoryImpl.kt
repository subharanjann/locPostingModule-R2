package com.swms.locpostingmoduleV1.data.repository

import android.util.Log
import com.swms.locpostingmoduleV1.domain.repository.ItemPutawayRepository
import com.swms.locpostingmoduleV1.data.apiService.LocationPostingApiInterface
import com.swms.locpostingmoduleV1.data.model.InputMappedtoItem
import com.swms.locpostingmoduleV1.data.model.ResponseBinCode
import com.swms.locpostingmoduleV1.data.model.ResponseLocationCode
import com.swms.locpostingmoduleV1.data.model.ResponsePalletCode
import com.swms.locpostingmoduleV1.data.model.ResponsePutawayItemTransfer
import com.swms.locpostingmoduleV1.util.Resource
import retrofit2.HttpException

class ItemPutawayRepositoryImpl(private val apiService : LocationPostingApiInterface):
    ItemPutawayRepository {
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
          if(myData.isSuccessful){
              val updateInfo = myData.body()
              if(updateInfo != null){
              Resource.Success(updateInfo)}
              else{
                  return   Resource.Error("Update information not available")
              }
          }
          else {
              val errorMessage = myData.errorBody()?.string()
              return   Resource.Error(errorMessage ?: "Failed to fetch update information")
          }
          }

      catch (e : HttpException){
          return  Resource.Error("Http Exceptions : ${e.code()}  ${e.message()}")
      }
        catch (e : Exception){
            return  Resource.Error(e.message ?: "timeout from api " )
        }
    }

    override suspend fun fetchBinCode(
        token: String,
        scannedBin: String
    ): Resource<ResponseBinCode> {
     return try {
         val apiCall = apiService.getBincode(scannedBin)
         if(apiCall.isSuccessful){
             val updateInfo =  apiCall.body()
             if(updateInfo != null){
                 Resource.Success(updateInfo)
             }
             else{
                 Resource.Error("No Data given by API")
             }
         }
         else{
             val msg = apiCall.errorBody()?.string()
             Resource.Error(msg ?:"Api Failed")
         }

     }
     catch (e : HttpException){
         Resource.Error("Http Exception : ${e.code()} , ${e.message()}")
     }
     catch (e : Exception){
         Resource.Error(e.message ?: "Unexpected Outcome , Api Timeout")
     }
    }

    override suspend fun fetchResponseFromItemTransfer(
        token: String,
        dataSet: InputMappedtoItem
    ): Resource<ResponsePutawayItemTransfer> {
        return try {
            val apiCall = apiService.itemTransferLocation(dataSet)
            if(apiCall.isSuccessful){
                val data = apiCall.body()
                if(data != null){
                    Resource.Success(data)
                }
                else{
                    Resource.Error("No Data given by API")
                }

            }
            else{
                val msg = apiCall.errorBody()?.string()
                Resource.Error(msg?:"Api Failed")
            }
        }
        catch (e : HttpException){
            Resource.Error( "HttpException : ${e.code()} , ${e.message()}")
        }
        catch (e : Exception){
            Resource.Error(e.message?:"Unexpected Outcome , likely Api Timeout")
        }
    }
}