package com.example.grace_elias_expense_tracker.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import com.example.grace_elias_expense_tracker.Expense
import kotlinx.coroutines.flow.Flow
import java.util.Date

@Dao
interface ExpenseDao {
    @Query("SELECT * FROM expense")
    fun getExpenses(): Flow<List<Expense>>

    @Query("SELECT * FROM expense WHERE date=(:date)")
    suspend fun getExpense(date: Date): Expense

    @Query("SELECT * FROM expense WHERE category=(:category)")
    suspend fun getExpense(category: String): Expense

    @Update
    suspend fun updateExpense(expense: Expense)
}