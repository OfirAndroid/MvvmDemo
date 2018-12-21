package com.example.user.mvvmdemo.utilities

import com.example.user.mvvmdemo.data.FakeDatabase
import com.example.user.mvvmdemo.data.FakeQuoteDao
import com.example.user.mvvmdemo.data.QuoteRepository
import com.example.user.mvvmdemo.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory() : QuotesViewModelFactory{
        val  quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return  QuotesViewModelFactory(quoteRepository)

    }
}