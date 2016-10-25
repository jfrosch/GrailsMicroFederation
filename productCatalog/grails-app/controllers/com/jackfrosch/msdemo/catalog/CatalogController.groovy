package com.jackfrosch.msdemo.catalog

import grails.rest.RestfulController

class CatalogController extends RestfulController {
	static responseformats = ['json', 'xml']

    CatalogController() {
        super(Catalog)
    }

}
