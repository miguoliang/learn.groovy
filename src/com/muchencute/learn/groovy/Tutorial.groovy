package com.muchencute.learn.groovy

import com.muchencute.learn.groovy.sections.MathSection
import com.muchencute.learn.groovy.sections.StringSection

class Tutorial {

    static void main(String[] args) {

        println("Hello World!")

        new MathSection().run();
        new StringSection().run();
    }

}