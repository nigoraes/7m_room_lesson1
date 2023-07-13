package com.example.a7m_room_lesson1.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import  com.example.a7m_room_lesson1.data.local.ContactDao
import com.example.a7m_room_lesson1.data.models.ContactEntity

@Database(entities = [ContactEntity::class], version = 1)
abstract class ContactDataBase : RoomDatabase() {

    abstract fun ContactDao() : ContactDao
}