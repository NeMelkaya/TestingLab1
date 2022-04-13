package com.example.test

import com.google.common.truth.Truth
import org.junit.Assert.*
import org.junit.Test

class TestingTest{

    @Test
    fun test1(){
        val n = 23
        val S = intArrayOf(2, 3, 5)
        assertEquals("-1--2--3-", Testing.fromNb2Str(n, S))
    }

    @Test
    fun test2(){
        val n = 0
        val S = intArrayOf(23, 51)
        assertEquals("-0--0-", Testing.fromNb2Str(n, S))
    }

    @Test
    fun test3(){
        val n = 33
        val S = intArrayOf(2, 3, 5, 25)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun test4(){
        val n = 555
        val S = intArrayOf(2, 5, 11)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun test5(){
        val n = 110
        val S = intArrayOf(2, 5, 11)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun test6(){
        val n = -343
        val S = intArrayOf(2, 3, 5)
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }

    @Test
    fun test7(){
        val n = 25
        val S = intArrayOf()
        assertEquals("Not applicable", Testing.fromNb2Str(n, S))
    }
}