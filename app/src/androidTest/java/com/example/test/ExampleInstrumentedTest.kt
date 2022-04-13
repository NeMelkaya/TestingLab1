package com.example.test

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun testSavePositiveResult() {
        val n = 29
        val S = intArrayOf(2, 3, 5)

        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val result = Files()
        result.writeToFile(Testing.fromNb2Str(n, S), appContext)

        assertEquals("-1--2--4-", result.readFromFile(appContext))
    }

    @Test
    fun testSaveNegativeResult() {
        val n = 33
        val S = intArrayOf(2, 3, 5)

        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        val result = Files()
        result.writeToFile(Testing.fromNb2Str(n, S), appContext)

        assertEquals("Not applicable", result.readFromFile(appContext))
    }

}