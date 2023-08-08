package onboarding

fun main() {
    var pobiList: List<Int> = listOf(131, 132)
    var crongList: List<Int> = listOf(211, 212)

    println(solution1(pobiList, crongList))
}

fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    if (pobi[0] + 1 != pobi[1] || pobi[0] + 1 != pobi[1]) {
        return -1
    } else {
        var pobiNum = calculate(pobi[0], pobi[1])
        var crongNum = calculate(crong[0], crong[1])

        if (pobiNum == crongNum) {
            return 0
        } else if (pobiNum > crongNum) {
            return 1
        } else {
            return 2
        }
    }
}

fun calculate(num1: Int, num2: Int): Int {
    var addNum1 = 0
    var multiply1 = 1
    var addNum2 = 0
    var multiply2 = 1
    var resultNum1: Int
    var resultNum2: Int

    var calnum1 = num1
    while (calnum1 > 0) {
        var i = calnum1 % 10
        calnum1 /= 10
        addNum1 += i
    }

    var calnum2 = num1
    while (calnum2 > 0) {
        var i = calnum2 % 10
        calnum2 /= 10
        multiply1 *= i
    }

    var calnum3 = num2
    while (calnum3 > 0) {
        var i = calnum3 % 10
        calnum3 /= 10
        addNum2 += i
    }

    var calnum4 = num2
    while (calnum4 > 0) {
        var i = calnum4 % 10
        calnum4 /= 10
        multiply2 *= i
    }

    if (addNum1 > multiply1) {
        resultNum1 = addNum1
    } else {
        resultNum1 = multiply1
    }

    if (addNum2 > multiply2) {
        resultNum2 = addNum2
    } else {
        resultNum2 = multiply2
    }

    if (resultNum1 > resultNum2) {
        return resultNum1
    } else {
        return resultNum2
    }
}