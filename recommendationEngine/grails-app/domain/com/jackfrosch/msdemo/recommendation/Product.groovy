package com.jackfrosch.msdemo.recommendation

class Product {
    String name
    String sku

    static hasMany = [ tags : Tag ]

    static constraints = {
        sku blank: false, maxSize: 32
        tags size: 1..20
    }

    String toString() {
        sku
    }
}
