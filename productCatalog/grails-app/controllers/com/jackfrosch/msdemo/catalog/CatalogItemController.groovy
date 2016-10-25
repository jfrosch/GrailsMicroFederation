package com.jackfrosch.msdemo.catalog

import grails.rest.RestfulController

class CatalogItemController extends RestfulController {
	static responseFormats = ['json', 'xml']

    CatalogItemController() {
        super(CatalogItem)
    }

}
