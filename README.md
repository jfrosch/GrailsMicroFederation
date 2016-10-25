# Building a Small Grails Microservice Federation
This is a tiny, two-service Grails 3 microservice federation supported by Eureka, Zuul and Hystrix from Spring Could / Netflix OSS.

See the PDF slide deck for the accompanying presentation.

# To tun the demo

1. Fork or download this repo. It includes five projects:
    a. eurekaServerSpringBoot
    b.   hystrixDashboardSpringBoot
    c.   productCatalog
    d.   recommendationEngine
    e.   zuulProxySpringBoot
2. Use the Gradle wrapper in each to build the projects
3. Launch the projects in this order:
    a. Eureka server
    b. Product Catalog
    c. Recommendation Engine
    d. Zuul server
    e. Hystrix Dashboard
4. Follow along in the slides to see each one in practice
5. With Hystrix Dashboard up and monitoring the stream URL shown in the slides
    a. Issue an HTTP GET request to <http://localhost:8765/product-catalog/productDetails/8>
    b. Be sure to set ```Accept: application/json``` header

 