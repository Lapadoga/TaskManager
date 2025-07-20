package com.example.domain.repository

import com.example.domain.model.Task
import java.util.Date

interface TasksRepository {
    suspend fun getTasksByDate(date: Date): List<Task>
    suspend fun getUnplannedTasks(): List<Task>
    suspend fun setTask(task: Task)
}