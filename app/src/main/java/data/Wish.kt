package com.example.wishlist.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id:Long=0L,
    @ColumnInfo("wish-title")
    val title:String="",
    @ColumnInfo("wish-desc")
    val description:String=""
)

object Wishes{
    val wishList= listOf(
        Wish(title = "first", description = "first Wish"),
        Wish(title = "first", description = "first Wish"),
        Wish(title = "first", description = "first Wish"),
        Wish(title = "first", description = "first Wish"),
        Wish(title = "first", description = "first Wish"),
        Wish(title = "first", description = "first Wish")
        )
}