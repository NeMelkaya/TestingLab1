package com.example.test

object Testing {

    fun fromNb2Str(
        n: Int,
        S: IntArray
    ): String{
        return when {
            n < 0 -> "Not applicable"
            S.isEmpty() -> "Not applicable"
            !checkProductOfModules(n, S)  -> "Not applicable"
            !checkModulesForPairwiseCoprime(S) -> "Not applicable"
            else -> getAnswer(n, S)
        }
    }


    fun getAnswer(n: Int, S:  IntArray): String{
        var answer = ""
        for (i in S){
            answer += "-${n % i}-"
        }
        return answer
    }
    private fun checkProductOfModules(n: Int, S:  IntArray): Boolean{
        var counter = 1
        for (i in S){
            counter *= i
            if(counter < 0) return false
        }
        return counter > n
    }
    private fun checkModulesForPairwiseCoprime(S:  IntArray): Boolean{
        for(i in S.indices){
            for(j in (i + 1) until S.size ){
                if(GCD(S[i], S[j]) != 1){
                    return false
                }
            }
        }
        return true
    }

    private fun GCD(x: Int, y: Int): Int {
        var gcd = 1
        var i = 1
        while (i <= x && i <= y) {
            if (x % i == 0 && y % i == 0)
                gcd = i
            ++i
        }
        return gcd
    }

}