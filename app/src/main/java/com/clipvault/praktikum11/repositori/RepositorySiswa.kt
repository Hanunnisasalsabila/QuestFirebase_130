package com.clipvault.praktikum11.repositori

import com.clipvault.praktikum11.modeldata.Siswa

interface RepositorySiswa {
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)
}
