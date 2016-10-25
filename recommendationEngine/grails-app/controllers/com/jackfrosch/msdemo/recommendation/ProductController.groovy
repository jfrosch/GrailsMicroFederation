package com.jackfrosch.msdemo.recommendation

import grails.rest.RestfulController

class ProductController extends RestfulController {
	static responseFormats = ['json', 'xml']
	
    ProductController() {
        super(Product)
    }
}
