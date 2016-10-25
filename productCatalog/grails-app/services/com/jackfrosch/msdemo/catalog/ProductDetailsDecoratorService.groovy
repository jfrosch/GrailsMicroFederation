package com.jackfrosch.msdemo.catalog

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import grails.plugins.rest.client.RestBuilder
import grails.transaction.Transactional

@Transactional
class ProductDetailsDecoratorService {

    @HystrixCommand(fallbackMethod = "defaultRecommendations")
    List<Product> findRecommendations(Product product) {
        RestBuilder rest = new RestBuilder()
        def resp = rest.get("http://localhost:8765/recommendation-engine/findRecommendation/${product.id}")

        if(resp.status == 500) {
            throw new RuntimeException("Error calling recommendation engine")
        }
        List recommendedProductIds = resp.json.recommendedProducts.collect { it.id as Long } ?: []

        recommendedProductIds ? Product.where { id in recommendedProductIds}.list() : []
    }

    List<Product> defaultRecommendations(Product product) {
        Product.findAllByTagsIlike('%cat%')
    }
}
