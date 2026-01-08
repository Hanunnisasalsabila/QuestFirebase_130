@file:OptIn(InternalSerializationApi::class)

package com.clipvault.praktikum11.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.clipvault.praktikum11.modeldata.Siswa
import com.clipvault.praktikum11.repositori.RepositorySiswa
import kotlinx.serialization.InternalSerializationApi

sealed interface StatusUIDetail {
    data class Success(val satusiswa: Siswa?) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

class DetailViewModel(savedStateHandle: SavedStateHandle,private val repositorySiswa:
RepositorySiswa) : ViewModel() {
}
