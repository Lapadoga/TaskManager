package com.example.domain.model

import java.util.Date

data class Task(
    val text: String,
    val date: Date,
    val items: List<Item>,
    val priority: Priority
)
