package com.muchencute.learn.groovy.sections

import groovy.transform.ToString

class ClassSection extends Section {

    @Override
    void run() {

        def king = new Animal("King", "Growl")
        println("$king.name says $king.sound")
        king.setSound("Grrrrr")
        println("$king.name says $king.sound")
        king.run();
        println(king.toString())

        def grover = new Dog("Grover", "Grrrr", "Derek")

        king.makeSound()
        grover.makeSound()
    }

}

@ToString(includeNames = true)
class Animal {

    def name
    def sound

    def Animal(name, sound) {
        this.name = name
        this.sound = sound
    }

    def run() {
        println("$name runs")
    }

    def makeSound() {
        println("$name says $sound")
    }

}

class Dog extends Animal {

    def owner

    def Dog(name, sound, owner) {
        super(name, sound)
        this.owner = owner
    }

    def makeSound() {
        println("$name says bark and $sound")
    }

}