package com.example.a7m_room_lesson1.data.local

import androidx.room.*
import com.example.a7m_room_lesson1.data.models.ContactEntity

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addContact(contactEntity: ContactEntity)

    @Query("SELECT * FROM contacts")
    suspend fun getContacts(): List<ContactEntity>

    @Query("SELECT * FROM contacts WHERE id = :contactId")
    suspend fun getContactById(contactId: Long): ContactEntity?

    @Query("SELECT * FROM contacts WHERE name LIKE '%' || :searchQuery || '%'")
    suspend fun searchContacts(searchQuery: String): List<ContactEntity>

    @Update
    suspend fun editContact(contactEntity: ContactEntity)

    @Delete
    suspend fun deleteContact(contactEntity: ContactEntity)
}