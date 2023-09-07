package com.curso.android.app.practica.uno

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Before
import org.junit.Test

class MainActivityTest {

    @Before
    fun setUp() {
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testUI() {
        onView(withId(R.id.editText1)).perform(typeText("Hello"), closeSoftKeyboard())
        onView(withId(R.id.editText2)).perform(typeText("Hello"), closeSoftKeyboard())
        onView(withId(R.id.buttonCompare)).perform(click())
        onView(withId(R.id.textResult)).check(matches(withText("Result: The character strings are the same")))
    }
}
