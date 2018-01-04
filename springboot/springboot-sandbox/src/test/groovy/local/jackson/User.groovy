package local.jackson

import com.fasterxml.jackson.annotation.JsonRootName

@JsonRootName(value = "user")
class User {
    int id
    String name
}
