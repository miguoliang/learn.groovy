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

        println("Math.log(2) = " + Math.log(2))
        println("Math.log10(2) = " + Math.log10(2))

        println("Math.toDegrees(Math.PI) = " + Math.toDegrees(Math.PI))
        println("Math.toRadians(90) = " + Math.toRadians(90))

        println("Math.sin(0.5 * Math.PI) = " + Math.sin(0.5 * Math.PI))
        println("Math.cos(0.5 * Math.PI) = " + Math.cos(0.5 * Math.PI))
        println("Math.tan(0.25 * Math.PI) = " + Math.tan(0.25 * Math.PI))
        println("Math.asin(0.5) = " + Math.asin(0.5))
        println("Math.acos(0.5) = " + Math.acos(0.5))
        println("Math.atan(1) = " + Math.atan(1))
        println("Math.sinh(0.5) = " + Math.sinh(0.5))
        println("Math.cosh(0.5) = " + Math.cosh(0.5))
        println("Math.tanh(0.5) = " + Math.tanh(0.5))

        println("Math.abs(new Random().nextInt() % 100) + 1 = " + Math.abs(new Random().nextInt() % 100) + 1)

    }

}
