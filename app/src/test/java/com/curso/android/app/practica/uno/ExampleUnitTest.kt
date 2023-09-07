package com.curso.android.app.practica.uno

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @Test
    fun testCompareTexts() {
        assertTrue(viewModel.compareTexts("Hello", "Hello"))
        assertFalse(viewModel.compareTexts("Hello", "World"))
    }
}
