package com.example.a7m_room_lesson1.data.mappers

import com.example.a7m_room_lesson1.data.models.ContactEntity
import com.example.a7m_room_lesson1.domain.models.Contact

fun ContactEntity.toEntity() = ContactEntity(id,name,number,address)
fun ContactEntity.toContact() = Contact(id,name,number,address)