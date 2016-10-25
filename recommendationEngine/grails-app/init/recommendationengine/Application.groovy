package recommendationengine

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@EnableEurekaClient
@EnableHystrix
@EnableCircuitBreaker
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}