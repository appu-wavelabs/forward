package com.grails

class HomeController {


    static defaultAction = 'index'

    def doForward() {
        println("test home doForward: " + params)
        forward(controller: 'some', action: 'doForward', params: [value1: 'aaa'])
    }

    def index () {
        println("test home index: "+ params)
        render view: 'index'
    }

}
