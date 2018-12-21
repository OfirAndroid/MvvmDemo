package com.example.user.mvvmdemo.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.user.mvvmdemo.data.Quote
import com.example.user.mvvmdemo.data.QuoteRepository

class QuotesViewModel(private  val quoteRepository: QuoteRepository) : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

}