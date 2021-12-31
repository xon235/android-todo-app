package com.survivalcoding.todolist.presentation.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.survivalcoding.todolist.R
import com.survivalcoding.todolist.model.Todo

class TodoListAdapter : ListAdapter<Todo, TodoViewHolder>(TodoDiffItemCallback) {
    var onChangeIsDone: (Todo) -> Unit = {}
    var onModifyTodo: (Int) -> Unit = { }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view, onChangeIsDone, onModifyTodo)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
