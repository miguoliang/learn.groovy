package com.muchencute.learn.groovy.sections

class FileSection extends Section {

    @Override
    void run() {

        new File("test.txt").eachLine {
            line -> println "$line"
        }

        new File("test.txt").withWriter("utf-8") {
            writer -> writer.write("Line 4\n")
        }

        File file = new File("test.txt");
        file.append("Line 5")

        println(file.text)

        println("File Size : ${file.length()} bytes");
        println("File : ${file.isFile()}")
        println("Dir : ${file.isDirectory()}")

        def newFile = new File("test2.txt")
        newFile << file.text
        newFile.delete()

        def dirFiles = new File("").listRoots()
        dirFiles.each {
            item -> println item.absolutePath
        }
    }

}
