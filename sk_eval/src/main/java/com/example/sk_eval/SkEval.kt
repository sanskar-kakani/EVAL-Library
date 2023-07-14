package com.example.sk_eval

import java.util.Stack

object SkEval {

    fun calculate(s: String): String {
        val stack = Stack<Int>()
        var result = 0
        var number = 0
        var sign = 1
        for (element in s) {
            if (Character.isDigit(element)) {
                number = 10 * number + (element - '0').toInt()
            } else if (element == '+') {
                result += sign * number
                number = 0
                sign = 1
            } else if (element == '-') {
                result += sign * number
                number = 0
                sign = -1
            } else if (element == '(') {
                stack.push(result)
                stack.push(sign)
                sign = 1
                result = 0
            } else if (element == ')') {
                result += sign * number
                number = 0
                result *= stack.pop()
                result += stack.pop()
            }
        }
        if (number != 0) result += sign * number
        return result.toString()
    }


}