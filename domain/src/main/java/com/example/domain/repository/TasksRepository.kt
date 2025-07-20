package com.example.domain.repository

import com.example.domain.model.Task
import java.util.Date

interface TasksRepository {
    fun getTasksByDate(date: Date): List<Task>
    fun getUnplannedTasks(): List<Task>
    fun setTask(task: Task)
}