package com.muchencute.learn.groovy.sections

class StringSection extends Section {

    @Override
    void run() {

        def name = "Eerek"

        println('I am ${name}')
        println("I am ${name}")

        println("3rd Index of Name " + name[3])
        println("Index of r " + name.indexOf('r'))
        println("1st 3 Chars " + name[0..2])
        println("Every Other Characters " + name[0, 2, 4])

        println("Substring at 1 " + name.substring(1))
        println("Substring at 1 to 4 " + name.substring(1, 4))
        println("My Name ".concat(name))
        println("What I Said is " * 2)
        println("Derek == Derek (equals) " + "Derek".equals("Derek"))
        println("Derek == derek (equalsIgnoreCase) " + "Derek".equalsIgnoreCase("derek"))

        def multString = '''I am
            a good boy, and
            this is a multiline string'''
        println(multString)

        def repeatString = "What I said is " * 2;
        println(repeatString - "What")
        println(repeatString.split(' '))
        println(repeatString.toList())
        println(repeatString.replaceAll('I', 'she'))
        println("Uppercase: " + repeatString.toUpperCase())
        println("Lowercase: " + repeatString.toLowerCase())

        println("Ant <=> Banana " + ("Ant" <=> "Banana"))
        println("Ant <=> Ant " + ("Ant" <=> "Ant"))
        println("Banana <=> Ant " + ("Banana" <=> "Ant"))

        def randomString = "Random"
        println("A $randomString string")
        printf("A %s string \n", randomString)
        printf("%-10s %d %.2f %10s \n", [
                "Stuff", 10, 1.235, "Random"
        ])
    }

}
