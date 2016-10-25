package productcatalog

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.hystrix.EnableHystrix

@EnableEurekaClient
@EnableHystrix
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}