package com.grails


class SomeController {

    static defaultAction = 'index'

    def index(SomeTestCommand cmd) {
        println("test some index: ${cmd.max}")
        render view: 'index'
    }

    def doForward() {
        println("test Some doForward: " + params)
        forward(controller: 'home', action: 'index', params: [value1: 'bbb', value2: 'ccc'])
    }
}

class SomeTestCommand {
    Integer max
    Integer offset
}
