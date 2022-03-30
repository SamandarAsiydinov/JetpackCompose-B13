package uz.context.composeb13.database

import javax.inject.Inject

class PersonRepository @Inject constructor(
    private val personDao: PersonDao
) {
    val readAll = personDao.readAll()
}