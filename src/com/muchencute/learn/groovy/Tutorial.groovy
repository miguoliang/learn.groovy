package com.muchencute.learn.groovy

import com.muchencute.learn.groovy.sections.*

class Tutorial {

    static void main(String[] args) {

        println("Hello World!")

        new MathSection().run()
        new StringSection().run()
        new FileSection().run()
        new ArraySection().run()
        new MapSection().run()
        new ConciseSection().run()
    }

}