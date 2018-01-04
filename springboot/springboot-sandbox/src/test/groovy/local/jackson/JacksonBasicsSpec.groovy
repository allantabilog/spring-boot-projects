package local.jackson

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import spock.lang.Specification

class JacksonBasicsSpec extends Specification {

    def "Parse JSON string into JsonNode"() {
        setup:
        def jsonString = '''
            {
                "k1":"v1",
                "k2":"v2",
                "k3":"v3"
            }
        '''

        def mapper = new ObjectMapper()

        when:
        JsonNode actualObject = mapper.readTree(jsonString)

        then:
        !actualObject

        JsonNode k1 = actualObject.get("k1")
        k1.textValue() == "v1"


    }

    def "Parse JSON into JsonNode - a bit more complex"() {
        setup:
        def json = '''
            {"brand":{"id":"1", "description":"red"},
             "address":{
                "postcode":"3000",
                "street":"Lonsdale",
                "flatNumber":"902"},
              "meter":{
                "type":"gas",
                "number":"GM001QT"
               }
              }  
        '''


        def mapper = new ObjectMapper()

        when:
        JsonNode searchParams = mapper.readTree(json)

        then:
//        searchParams.get("brand").get("id") == 1
//        searchParams.get("brand").get("description") == "red"
//        searchParams.get("address").get("postcode") == "3000"
        searchParams.get("brand").get("id").textValue() == "1"
        println searchParams.path("id")

    }

    def "Marshall an object into JSON"() {
        setup:
        ExtendableBean bean = new ExtendableBean(name: "myBean", properties: ["hostname": "localhost", "port": "8080"])

        when:
        def result = new ObjectMapper().writeValueAsString(bean)

        then:
        def expected = '''{"name":"myBean","hostname":"localhost","port":"8080"}'''

        result == expected
    }

    def "Marshall an object into JSON - with JsonRootName"() {
        setup:
        def user = new User(id: 1, name: 'Jason')
        def mapper = new ObjectMapper()
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE)

        when:
        def result = mapper.writeValueAsString(user)

        then:
        println result

    }

    def "Marshall an object graph into JSON"() {
        setup:
        def contact = new Contact(
                user: new User(id: 1, name: 'joe'),
                address: new Address(streetNumber: 1, streetName: 'Lonsdale Street', city: 'Melbourne', country: 'Australia', postCode: '3000'))

        def mapper = new ObjectMapper()
        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE)

        when:
        def result = mapper.writeValueAsString(contact)


        then:
        println result

    }

}
