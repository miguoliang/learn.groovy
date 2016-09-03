package com.muchencute.learn.groovy.sections

class ArraySection extends Section {

    @Override
    void run() {

        def primes = [2, 3, 5, 7, 11, 13]

        println("2nd prime " + primes[1])
        println("3rd prime " + primes.get(2))

        def employee = ['Derek', 40, 6.25, [1, 2, 3]]
        println("2nd Number " + employee[3][1])
        println("2nd prime " + employee[2])
        println("Length " + employee.size())

        primes << 19;
        primes.add(17)
        primes + [29, 31]
        primes - [31]

        println("Is Empty " + primes.isEmpty())
        println("1st 3 " + primes[0..2])
        println(primes)

        println("Matches " + primes.intersect([2, 3, 7]))
        println("Reverse " + primes.reverse())
        println("Sort " + primes.sort())
        println("Last " + primes.pop())
    }

}
