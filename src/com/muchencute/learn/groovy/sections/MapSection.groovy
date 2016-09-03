package com.muchencute.learn.groovy.sections

class MapSection extends Section {

    @Override
    void run() {

        def paulMap = [
                'name'   : 'Paul',
                'age'    : 35,
                'address': '123 Main St',
                'list'   : [1, 2, 3]
        ]

        println("Name " + paulMap['name'])
        println("Age " + paulMap.get('age'))
        println("List Item " + paulMap['list'][1])

        paulMap.put('city', 'Beijing')
        println("Has City " + paulMap.containsKey('city'))
        println("Size " + paulMap.size())
    }

}
