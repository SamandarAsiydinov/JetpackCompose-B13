package uz.context.composeb13.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.context.composeb13.database.PersonRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    personRepository: PersonRepository
): ViewModel() {
    val readAll = personRepository.readAll
}