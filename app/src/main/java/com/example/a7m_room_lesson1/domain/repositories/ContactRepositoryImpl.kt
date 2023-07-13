package com.example.a7m_room_lesson1.domain.repositories

import com.example.a7m_room_lesson1.data.local.ContactDao
import com.example.a7m_room_lesson1.data.mappers.toEntity
import com.example.a7m_room_lesson1.data.models.ContactEntity
import com.example.a7m_room_lesson1.domain.models.Contact
import com.example.a7m_room_lesson1.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class ContactRepositoryImpl @Inject constructor(private val  contactDao: ContactDao) : ContactsRepository {


    override fun addContact(contactEntity: ContactEntity): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = contactDao.addContact(contactEntity.toEntity())
                emit(Resource.Success(data))
            }catch (e: Exception){
                emit(Resource.Error(
                    if (e.localizedMessage != null){
                        e.localizedMessage
                    }else{
                        "unknown error"
                    }
                ))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getContacts(): Flow<Resource<List<ContactEntity>>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = contactDao.getContacts()
                emit(Resource.Success(data))
            }catch (e: Exception){
                emit(Resource.Error(
                    if (e.localizedMessage != null){
                        e.localizedMessage
                    }else{
                        "unknown error"
                    }
                ))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun editContact(contactEntity: ContactEntity): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = contactDao.editContact(contactEntity.toEntity())
                emit(Resource.Success(data))
            }catch (e: Exception){
                emit(Resource.Error(
                    if (e.localizedMessage != null){
                        e.localizedMessage
                    }else{
                        "unknown error"
                    }
                ))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun deleteContact(contactEntity: ContactEntity): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = contactDao.deleteContact(contactEntity.toEntity())
                emit(Resource.Success(data))
            }catch (e: Exception){
                emit(Resource.Error(
                    if (e.localizedMessage != null){
                        e.localizedMessage
                    }else{
                        "unknown error"
                    }
                ))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun getContactById(contactEntity: ContactEntity) : Flow<Resource<Unit>>{
        return flow {
            emit(Resource.Loading())
            try {
                val data = contactDao.deleteContact(contactEntity.toEntity())
                emit(Resource.Success(data))
            }catch (e: Exception){
                emit(Resource.Error(
                    if (e.localizedMessage != null){
                        e.localizedMessage
                    }else{
                        "unknown error"
                    }
                ))
            }
        }.flowOn(Dispatchers.IO)
    }

    override fun searchContacts(contactEntity: ContactEntity): Flow<Resource<Unit>> {
        return flow {
            emit(Resource.Loading())
            try {
                val data = contactDao.deleteContact(contactEntity.toEntity())
                emit(Resource.Success(data))
            }catch (e: Exception){
                emit(Resource.Error(
                    if (e.localizedMessage != null){
                        e.localizedMessage
                    }else{
                        "unknown error"
                    }
                ))
            }
        }.flowOn(Dispatchers.IO)
    }

}