package com.muchencute.learn.groovy.sections

class MathSection extends Section{

    @Override
    void run() {

        println("5 + 4 = " + (5 + 4))
        println("5 - 4 = " + (5 - 4))
        println("5 * 4 = " + (5 * 4))
        println("5 / 4 = " + (5 / 4))
        println("5.intdiv(4) = " + (5.intdiv(4)))
        println("5 % 4 = " + (5 % 4))

        println("5.2 + 4.4 = " + (5.2 + 4.4))
        println("5.2 - 4.4 = " + (5.2 - 4.4))
        println("5.2 * 4.4 = " + (5.2 * 4.4))
        println("5.2 / 4.4 = " + (5.2 / 4.4))

        println("2 + 3 * 5 = " + (2 + 3 * 5))
        println("(2 + 3) * 5 = " + ((2 + 3) * 5))

        def age = 40;
        println("age++ = " + (age++))
        println("++age = " + (++age))
        println("age-- = " + (age--))
        println("--age = " + (--age))

        println("Biggest Int " + Integer.MAX_VALUE)
        println("Smallest Int " + Integer.MIN_VALUE)

        println("Biggest Float " + Float.MAX_VALUE)
        println("Smallest Float " + Float.MIN_VALUE)

        println("Biggest Double " + Double.MAX_VALUE)
        println("Smallest Double " + Double.MIN_VALUE)

        def randNum = 2.0
        println("Math.abs(-2.45) = " + Math.abs(-2.45))
        println("Math.round(2.45) = " + Math.round(2.45))
        println("randNum.pow(3) = " + randNum.pow(3))
        println("3.0.equals(2.0) = " + 3.0.equals(2.0))
        println("randNum.equals(Float.NaN) = " + (randNum == Float.NaN))
        println("Math.sqrt(9) = " + Math.sqrt(9))
        println("Math.cbrt(27) = " + Math.cbrt(27))
        println("Math.ceil(2.45) = " + Math.ceil(2.45))
        println("Math.floor(2.45) = " + Math.ceil(2.45))
        println("Math.min(2,3) = " + Math.min(2, 3))
        println("Math.max(2,3) = " + Math.max(2, 3))

    }

}
