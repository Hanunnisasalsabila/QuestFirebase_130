package com.clipvault.praktikum11.view.route

import com.clipvault.praktikum11.R
import com.clipvault.praktikum11.view.route.DestinasiNavigasi

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}