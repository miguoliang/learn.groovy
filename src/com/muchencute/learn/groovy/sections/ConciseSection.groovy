package com.muchencute.learn.groovy.sections

class ConciseSection extends Section {
    @Override
    void run() {

        def oneTo10 = 1..10
        def aToZ = 'a'..'z'
        def zToA = 'z'..'a'

        println(oneTo10)
        println(aToZ)
        println(zToA)

        println("Get Last " + oneTo10.getTo())
        println("Get First " + oneTo10.getFrom())

        def ageOld = 6;
        switch (ageOld) {
            case 0..6:
                println("Child")
                break
            case 7..12:
                println("Teenager")
                break
            case 13..18:
                println("Young Adult")
                break
            default:
                println("Adult")
        }

        for (i in 2..6) {
            println(i)
        }

        def randList = [10, 12, 13, 14]
        for (i in randList) {
            println(i)
        }

        def custs = [
                100: "Paul",
                101: "Sally",
                102: "Sue"
        ]
        for (cust in custs) {
            println("$cust.value : $cust.key")
        }

    }
}
