package com.example.grace_elias_expense_tracker

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.fragment.app.viewModels
import java.util.UUID

private const val TAG = "ExpenseDetailFragment"
class ExpenseEditFragment : Fragment()
{
    private var _binding: FragmentExpenseEditBinding? = null
    private val binding
        get() = checkNotNull(_binding)
        {
            "Cannot access binding because it is null. Is the view visible?"
        }

    private val args: ExpenseEditFragmentArgs by navArgs()

    private val expenseEditViewModel: ExpenseEditViewModel by viewModels{
        ExpenseEditViewModelFactory(args.expenseId)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        val expense = Expense(
            id = UUID.randomUUID(),
            date = Date(),
            amount = 0.0,
            category = ""
        )

        Log.d(TAG, "The expense ID is: ${args.expenseId}")
    }
}