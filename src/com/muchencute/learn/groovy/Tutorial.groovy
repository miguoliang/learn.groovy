package com.muchencute.learn.groovy

import com.muchencute.learn.groovy.sections.*

class Tutorial {

    static void main(String[] args) {

        println("Hello World!")

        new MathSection().run()
        new StringSection().run()
        new ArraySection().run()
        new MapSection().run()
        new ConciseSection().run()
        new FunctionSection().run()
        new FileSection().run()
    }

}