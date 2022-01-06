package com.survivalcoding.todolist.domain.repository

import com.survivalcoding.todolist.domain.model.ToDo
import kotlinx.coroutines.flow.StateFlow

interface ToDoRepository {
    val toDoList: StateFlow<List<ToDo>>

    fun updateItem(id: Long, newItem: ToDo)
    fun deleteItem(id: Long)
    fun addItem(newItem: ToDo)
    fun searchItem(query: String)
}