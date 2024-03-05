package com.example.grace_elias_expense_tracker

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.UUID
import java.util.Date
@Entity
data class Expense(
    @PrimaryKey val id: UUID,
    val date: Date,
    val amount: Double,
    val category: String
)