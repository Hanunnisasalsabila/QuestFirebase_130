@file:OptIn(InternalSerializationApi::class)

package com.clipvault.praktikum11.viewmodel
import com.clipvault.praktikum11.modeldata.Siswa
import kotlinx.serialization.InternalSerializationApi

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
