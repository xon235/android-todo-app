package com.survivalcoding.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val today: Calendar = Calendar.getInstance()

        val data = mutableListOf<TodoList>()
        for (i in 1..30) { // i에 따라 제목, 날짜, 내용을 다르게 적어서 추
            today.add(Calendar.DATE, 1)
            data.add(TodoList("# $i", today.time, "${i}번째 내용입니다"))
        }

        val adapter = TodoListAdapter(data)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, _ ->
            adapter.setClicked(position)
            adapter.getView(position, view, parent) // 하나의 뷰만 반응하게
            // adapter.notifyDataSetChanged() // 전체 리셋
        }
    }
}

