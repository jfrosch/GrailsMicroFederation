package productcatalog

import grails.core.GrailsApplication
import grails.plugins.GrailsPluginManager
import grails.plugins.PluginManagerAware
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker

@EnableCircuitBreaker
class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }
}
