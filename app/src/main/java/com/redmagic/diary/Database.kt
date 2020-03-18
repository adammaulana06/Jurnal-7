package com.redmagic.diary

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Pengguna::class), version = 1)
abstract class Database : RoomDatabase() {
    abstract fun userDao(): PenggunaDAO
}