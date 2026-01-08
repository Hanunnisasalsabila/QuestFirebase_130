@file:OptIn(InternalSerializationApi::class)

package com.clipvault.praktikum11.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.clipvault.praktikum11.modeldata.Siswa
import com.clipvault.praktikum11.repositori.RepositorySiswa
import com.clipvault.praktikum11.view.route.DestinasiDetail
import kotlinx.serialization.InternalSerializationApi

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(savedStateHandle: SavedStateHandle,private val repositorySiswa:
RepositorySiswa) : ViewModel() {

    private val idSiswa: Long =
        savedStateHandle.get<String>(DestinasiDetail.itemIdArg)?.toLong()
            ?: error("idSiswa tidak ditemukan di SavedStateHandle")
    var statusUIDetail: StatusUIDetail by mutableStateOf(StatusUIDetail.Loading)
        private set

}
