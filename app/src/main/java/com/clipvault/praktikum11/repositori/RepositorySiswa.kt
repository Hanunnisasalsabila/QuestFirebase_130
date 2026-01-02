package com.clipvault.praktikum11.repositori

import com.clipvault.praktikum11.modeldata.Siswa
import com.google.firebase.firestore.FirebaseFirestore
interface RepositorySiswa {
    suspend fun getDataSiswa(): List<Siswa>
    suspend fun postDataSiswa(siswa: Siswa)
}
class FirebaseRepositorySiswa : RepositorySiswa {
    private val db = FirebaseFirestore.getInstance()
    private val collection = db.collection("siswa")