package uz.context.composeb13.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "person")
data class Person(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val age: Int
)
