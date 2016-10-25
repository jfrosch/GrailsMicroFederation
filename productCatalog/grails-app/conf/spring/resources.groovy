package spring

import com.jackfrosch.msdemo.catalog.Catalog
import com.jackfrosch.msdemo.catalog.CatalogItem
import com.jackfrosch.msdemo.catalog.Product
import grails.rest.render.hal.HalJsonCollectionRenderer
import grails.rest.render.hal.HalJsonRenderer

// Place your Spring DSL code here
beans = {
    halProductRenderer(HalJsonRenderer, Product)
    halProductCollectionRenderer(HalJsonCollectionRenderer, Product)

    halCatalogRenderer(HalJsonRenderer, Catalog)
    halCatalogCollectionRenderer(HalJsonCollectionRenderer, Catalog)

    halCatalogItemRenderer(HalJsonRenderer, CatalogItem)
    halCatalogItemCollectionRenderer(HalJsonCollectionRenderer, CatalogItem)
}
