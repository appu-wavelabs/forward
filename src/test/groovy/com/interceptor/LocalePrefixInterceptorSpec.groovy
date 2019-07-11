package com.interceptor

import grails.testing.web.interceptor.InterceptorUnitTest
import spock.lang.Specification

class LocalePrefixInterceptorSpec extends Specification implements InterceptorUnitTest<LocalePrefixInterceptor> {

    def setup() {
    }

    def cleanup() {

    }

    void "Test localePrefix interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"localePrefix")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
