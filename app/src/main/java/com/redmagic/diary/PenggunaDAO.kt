package com.redmagic.diary

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface PenggunaDAO {
    @Query("SELECT * FROM pengguna")
    fun getAll(): List<Pengguna>

    @Query("SELECT * FROM pengguna WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Pengguna>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Pengguna

    @Insert
    fun insertAll(vararg users: Pengguna)

    @Delete
    fun delete(user: Pengguna)
}