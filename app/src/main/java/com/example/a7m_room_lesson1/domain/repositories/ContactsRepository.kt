package com.example.a7m_room_lesson1.domain.repositories

import com.example.a7m_room_lesson1.data.models.ContactEntity
import com.example.a7m_room_lesson1.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ContactsRepository {

    fun addContact(contactEntity: ContactEntity) : kotlinx.coroutines.flow.Flow<Resource<Unit>>

    fun getContacts(): Flow<Resource<List<ContactEntity>>>

    fun editContact(contactEntity: ContactEntity) : Flow<Resource<Unit>>

    fun deleteContact(contactEntity: ContactEntity) : Flow<Resource<Unit>>

    fun getContactById(contactEntity: ContactEntity) : Flow<Resource<Unit>>

    fun searchContacts(contactEntity: ContactEntity) : Flow<Resource<Unit>>

}