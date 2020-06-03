package com.adzarei.learning.maven.tests.spock

import spock.lang.Specification

class SpockSpecHelloWorldTest extends Specification {

    def "GetAndPrintMsg"() {
        def helloWorld = new HelloWorld()

        when:
            helloWorld.getAndPrintMsg() == "Hello World"

        then:
            true
    }
}
