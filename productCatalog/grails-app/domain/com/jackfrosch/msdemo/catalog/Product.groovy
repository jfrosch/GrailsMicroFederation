package com.jackfrosch.msdemo.catalog

class Product {
    String sku
    String name
    String description
    BigDecimal msrp
    String tags

    static constraints = {
        sku blank: false, maxSize: 32
        name  blank: false, maxSize: 64
        description blank: false, maxSize: 4096
        msrp min: 0.01
        tags maxSize: 256
    }
}
