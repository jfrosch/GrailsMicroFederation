import com.jackfrosch.msdemo.recommendation.Product
import com.jackfrosch.msdemo.recommendation.Tag

class BootStrap {

    def init = { servletContext ->
        Closure toTag = { new Tag(value: it) }

        [
            new Product(sku: 'S1231', name: 'Here Kitty Kitty 2017 Calendar', tags : ['cat', 'cats', 'kitten', 'kittens'].collect(toTag)),
            new Product(sku: 'S1232', name: 'Raining Cats and Dogs 2017 Calendar', tags : ['cat', 'cats', 'dog', 'dogs'].collect(toTag)),
            new Product(sku: 'S1233', name: 'Puppy Love 2017 Calendar', tags : ['dog', 'dogs', 'puppy', 'puppies'].collect(toTag)),
            new Product(sku: 'S1234', name: 'Tweets 2017 Calendar', tags : ['dog', 'dogs', 'puppy', 'puppies'].collect(toTag)),
            new Product(sku: 'S1235', name: 'Rather be Sailing 2017 Calendar', tags : ['boat', 'sailboat', 'lakes', 'ocean'].collect(toTag)),
            new Product(sku: 'S1236', name: 'Rather be Flying 2017 Calendar', tags : ['aircraft', 'aviation', 'flight', 'jet', 'plane'].collect(toTag)),
            new Product(sku: 'S1237', name: 'Final Frontier 2017 Calendar', tags : ['astronomy', 'hubble', 'nasa', 'space'].collect(toTag)),
            new Product(sku: 'S1238', name: 'Classic Trek 2017 Calendar', tags : ['kirk', 'spock', 'mccoy', 'scotty', 'uhura', 'checkov', 'sulu', 'chapel', 'star trek'].collect(toTag)),
            new Product(sku: 'S1239', name: 'NG Trek 2017 Calendar', tags : ['data', 'frakes', 'picard', 'troi', 'crusher', 'worf', 'star trek', 'star trek ng'].collect(toTag)),
            new Product(sku: 'S1210', name: 'Deep Space 9 2017 Calendar', tags : ['sisko', 'odo', 'quark', 'worf', 'nerys', 'dax', "o'brien", 'star trek', 'deep space 9'].collect(toTag))
        ].each { Product product -> product.save(failOnError: true, flush: true) }
    }

    def destroy = {
    }
}
