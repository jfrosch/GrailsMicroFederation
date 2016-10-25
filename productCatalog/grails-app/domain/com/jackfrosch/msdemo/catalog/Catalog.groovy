package com.jackfrosch.msdemo.catalog

class Catalog {
    String name
    Date publicationDate
    Date expirationDate

    static hasMany = [catalogItems: CatalogItem]

    static constraints = {
        name()
        publicationDate validator: { value -> value.after(new Date() - 1) }
        expirationDate nullable: true, validator: { value, obj -> value == null || value.after(obj.publicationDate) }
    }
}