import com.jackfrosch.msdemo.catalog.Catalog
import com.jackfrosch.msdemo.catalog.CatalogItem
import com.jackfrosch.msdemo.catalog.Product

class BootStrap {

    def init = { servletContext ->
        List products = [
            new Product(sku: 'S1231', name: 'Here Kitty Kitty 2017 Calendar',
                        description: 'Only cats in this playful 2017 calendar',
                        msrp: 14.99, tags : ['cat', 'cats', 'kitten', 'kittens']),
            new Product(sku: 'S1232', name: 'Raining Cats and Dogs 2017 Calendar',
                        description: 'Cats rule and dogs drool in this inter-species rivalry calendar',
                        msrp: 15.99, tags : ['cat', 'cats', 'dog', 'dogs']),
            new Product(sku: 'S1233', name: 'Puppy Love 2017 Calendar',
                        description: "A full year's worth of playful puppies in this beautiful calendar",
                        msrp: 13.99, tags : ['dog', 'dogs', 'puppy', 'puppies']),
            new Product(sku: 'S1234', name: 'Tweets 2017 Calendar',
                        description: "Songbirds for all seasons are represented in this beautiful calendar",
                        msrp: 13.99, tags : ['bird', 'songbird']),
            new Product(sku: 'S1235', name: 'Rather be Sailing 2017 Calendar',
                        description: "If you love water, you'll love this beautiful calendar all about sailing",
                        msrp: 16.99, tags : ['boat', 'sailboat', 'lakes', 'ocean']),
            new Product(sku: 'S1236', name: 'Rather be Flying 2017 Calendar',
                        description: "Slip the surly bonds in 2017 with this high flying calendar all about aviation",
                        msrp: 17.99, tags : ['aircraft', 'aviation', 'flight', 'jet', 'plane']),
            new Product(sku: 'S1237', name: 'Final Frontier 2017 Calendar',
                        description: "Let this calendar's beautiful collections of astronomy photos guide your imagination",
                        msrp: 12.99, tags : ['astronomy', 'hubble', 'nasa', 'space']),
            new Product(sku: 'S1238', name: 'Classic Trek 2017 Calendar',
                        description: "A full year's worth of iconic imagery from the original Star Trek series",
                        msrp: 15.99, tags : ['kirk', 'spock', 'mccoy', 'scotty', 'uhura', 'checkov', 'sulu', 'chapel', 'star trek']),
            new Product(sku: 'S1239', name: 'NG Trek 2017 Calendar',
                        description: "For Next Generation fans, a great collection of iconic imagery from the Star Trek NG",
                        msrp: 16.99, tags : ['data', 'frakes', 'picard', 'troi', 'crusher', 'worf', 'star trek', 'star trek ng']),
            new Product(sku: 'S1210', name: 'Deep Space 9 2017 Calendar',
                        description: "Never forget Deep Space 9 with this collection of iconic imagery from the ground breaking series",
                        msrp: 11.99, tags : ['sisko', 'odo', 'quark', 'worf', 'nerys', 'dax', "o'brien", 'star trek', 'deep space 9'])
        ]
        products.each { Product product -> product.save(failOnError: true, flush: true) }

        Catalog fall16 = new Catalog(name: 'Fall 2017', publicationDate: new Date(2016, Calendar.OCTOBER, 1),
                                                        expirationDate: new Date(2017, Calendar.JANUARY, 31))

        List catalogItems = products.collect { Product product -> new CatalogItem(product: product, price: product.msrp - 3.50)}
        catalogItems.each { CatalogItem item -> fall16.addToCatalogItems(item) }

        fall16.save(failOnError: true, flush: true)

    }
    def destroy = {
    }
}
