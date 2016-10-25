package com.jackfrosch.msdemo.recommendation


class RecommendationController {
	static responseFormats = ['json', 'xml']

    RecommendationService recommendationService

    def findRecommendation(Product product) {
        if(!product) {
            response.sendError(404)
        }

        respond recommendationService.deriveRecommendation(product)
    }
}
