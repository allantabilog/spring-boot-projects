package local.jackson

import com.fasterxml.jackson.annotation.JsonAnyGetter

class ExtendableBean {
    String name

    Map<String, String> properties

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        properties
    }
}
