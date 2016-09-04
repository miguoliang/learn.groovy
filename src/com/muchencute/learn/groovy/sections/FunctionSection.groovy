package com.muchencute.learn.groovy.sections

class FunctionSection extends Section {

    @Override
    void run() {

        def listToDouble = [1, 2, 3, 4]
        listToDouble = doubleList(listToDouble)
        println(listToDouble)

        def nums = sumAll(1, 2, 3, 4)
        println("Sum : " + nums)

        def num = factorial(4)
        println("Factorial 4 : " + num)

        def getFactorial = { n -> (n <= 1 ? 1 : n * call(n - 1)) }
        println("Factorial 4 : " + getFactorial(4))

        def greeting = "Goodbye"
        def sayGoodbye = { theName -> println("$greeting $theName") }
        sayGoodbye("Derek")

        def nameList = ["John", "Doug", "Derek"]
        def matchEle = nameList.find { name -> name == "Derek" }
        println(matchEle)

        def numList = [1, 2, 3, 4, 5, 6, 7]
        def matchNum = numList.findAll({ theNum -> theNum > 4 })
        println(matchNum)
        println("Any > 5 : " + numList.any { theNum -> theNum > 5 })
        println("Every > 1 : " + numList.every { theNum -> theNum > 1 })
        println("Double : " + numList.collect { theNum -> theNum * 2 })

        def getEven = { item -> return (num % 2 == 0) }
        def evenNums = listEdit(numList, getEven)
        println("Evens : " + evenNums)
    }

    static def listEdit(list, clo) {
        return list.findAll(clo)
    }

    static def doubleList(list) {
        def newList = list.collect { it * 2 }
        return newList
    }

    static def sumAll(int ... num) {
        def sum = 0
        num.each { sum += it }
        return sum
    }

    static def factorial(num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
