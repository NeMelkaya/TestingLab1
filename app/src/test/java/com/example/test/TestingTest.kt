package com.example.test

import com.google.common.truth.Truth
import org.junit.Assert.*
import org.junit.Test

class TestingTest{

    @Test
    fun `positive test with maximum allowable n`(){
        val n = 29
        val S = intArrayOf(2, 3, 5)
        assertEquals("-1--2--4-", Testing.fromNb2Str(n, S))
    }

    @Test
    fun `positive test with minimum allowable n`(){
        val n = 0
        val S = intArrayOf(23, 51)
        assertEquals("-0--0-", Testing.fromNb2Str(n, S))
    }

    @Test
    fun `modules are not pairwise coprime`(){
        val n = 33
        val S = intArrayOf(2, 3, 5, 25)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun `the product of modules is less than the number n`(){
        val n = 555
        val S = intArrayOf(2, 5, 11)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun `the product of modules is equal to the number n`(){
        val n = 110
        val S = intArrayOf(2, 5, 11)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun `the number n is negative`(){
        val n = -343
        val S = intArrayOf(2, 3, 5)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun `the array of modules is empty`(){
        val n = 25
        val S = intArrayOf()
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }
}