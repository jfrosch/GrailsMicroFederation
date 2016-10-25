package com.jackfrosch.msdemo.catalog

class CatalogItem {
    Product product
    BigDecimal price

    static belongsTo = [catalog : Catalog]

    static constraints = {
        catalog()
        product()
        price min: 0.01
    }
}
