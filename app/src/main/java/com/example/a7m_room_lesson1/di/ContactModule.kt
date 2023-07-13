package com.example.a7m_room_lesson1.di

import android.content.Context
import androidx.room.Room
import com.example.a7m_room_lesson1.data.local.ContactDao
import com.example.a7m_room_lesson1.data.local.ContactDataBase
import com.example.a7m_room_lesson1.domain.repositories.ContactRepositoryImpl
import com.example.a7m_room_lesson1.domain.repositories.ContactsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ContactModule {

    @Singleton
    @Provides
    fun  provideContactDatabase(
    @ApplicationContext context: Context
    ) = Room.databaseBuilder(context,ContactDataBase:: class.java,"contact_db")

    @Provides
    fun provideContactDao(contactDataBase: ContactDataBase) = contactDataBase.ContactDao()

    @Provides
    fun provideContactRepository(contactDao: ContactDao) : ContactsRepository{
        return ContactRepositoryImpl(contactDao)
    }

}