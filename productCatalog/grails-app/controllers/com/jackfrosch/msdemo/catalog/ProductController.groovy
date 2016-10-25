package com.jackfrosch.msdemo.catalog

import grails.converters.JSON
import grails.converters.XML
import grails.rest.RestfulController

class ProductController extends RestfulController {
    static responseFormats = ['json', 'xml']

    ProductDetailsDecoratorService productDetailsDecoratorService

    ProductController() {
        super(Product)
    }

    def productDetails(Product product) {
        if(!product) {
            response.sendError(404, 'No product specified')
        }

        Map data = [product: product, recommendedProducts: productDetailsDecoratorService.findRecommendations(product)]

        withFormat {
            json { render data as JSON }
            xml { render data as XML }
        }
    }
}
