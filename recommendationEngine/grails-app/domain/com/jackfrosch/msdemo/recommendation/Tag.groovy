package com.jackfrosch.msdemo.recommendation

class Tag {
    String value

    static belongsTo = [product : Product]

    static constraints = {
        value blank: false, maxSize: 16
    }
}
