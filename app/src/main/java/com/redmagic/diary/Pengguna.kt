package com.redmagic.diary

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Pengguna(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "date") val firstName: String?,
    @ColumnInfo(name = "text") val lastName: String?
)