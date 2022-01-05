package com.survivalcoding.todolist.domain.usecase

import com.survivalcoding.todolist.domain.repository.ToDoRepository
import javax.inject.Inject

class GetAllToDoUseCase @Inject constructor(private val toDoRepository: ToDoRepository) {
    operator fun invoke() = toDoRepository.toDoList
}