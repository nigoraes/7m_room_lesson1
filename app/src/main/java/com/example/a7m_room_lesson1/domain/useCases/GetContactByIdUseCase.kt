package com.example.a7m_room_lesson1.domain.useCases

import com.example.a7m_room_lesson1.data.models.ContactEntity
import com.example.a7m_room_lesson1.domain.repositories.ContactsRepository
import javax.inject.Inject

class GetContactByIdUseCase @Inject constructor(private val contactRepository : ContactsRepository){

    fun addContact(contactEntity: ContactEntity){
        contactRepository.addContact(contactEntity)
    }

}