package local.jackson

import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName(value = "contact")
class Contact {
    User user
    Address address
}
