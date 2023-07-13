package com.example.a7m_room_lesson1.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class ContactEntity(
    @PrimaryKey(autoGenerate = true )
    val id:Int,
    val name: String,
    val number: Int,
    val address: String,
)