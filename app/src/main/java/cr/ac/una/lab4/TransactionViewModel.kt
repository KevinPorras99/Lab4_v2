package cr.ac.una.lab4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class TransactionViewModel : ViewModel() {
    val transactions = MutableLiveData<List<Transaction>>()

    fun addTransaction(transaction: Transaction) {
        val currentList = transactions.value ?: emptyList()
        transactions.value = currentList + transaction
    }

    fun updateTransaction(updatedTransaction: Transaction) {
        val currentList = transactions.value ?: emptyList()
        val index = currentList.indexOfFirst { it.id == updatedTransaction.id }
        if (index != -1) {
            val updatedList = currentList.toMutableList()
            updatedList[index] = updatedTransaction
            transactions.value = updatedList
        }
    }
    fun deleteTransaction(transaction: Transaction) {
        val currentList = transactions.value ?: emptyList()
        val updatedList = currentList.filter { it.id != transaction.id }
        transactions.value = updatedList
    }

}