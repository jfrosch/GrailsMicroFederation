package com.jackfrosch.msdemo.recommendation

import com.jackfrosch.msdemo.catalog.Recommendation

class RecommendationService {

    Recommendation deriveRecommendation(Product product) {
        Set<Product> recommendations = Product.where {
                                         tags { value in product.tags*.value }
                                       }.list()

        new Recommendation(product: product, recommendedProducts : recommendations)
    }
}
