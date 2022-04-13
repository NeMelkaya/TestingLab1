package com.example.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class UITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun listGoesOverTheFold() {
        // ввести данные
        onView(withId(R.id.etN)).perform(typeText("1"))
        // нажать гоу
        onView(withId(R.id.btnGo)).perform(click())
        //посмотреть результат
        onView(withId(R.id.result)).check(matches(withText("Not applicable")))
    }
}