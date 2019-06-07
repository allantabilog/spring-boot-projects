package au.com.redenergy.data

class Error {
    String description

    Error() {
    }

    Error(String description) {
        this.description = description
    }

    String getDescription() {
        return description
    }

    void setDescription(String description) {
        this.description = description
    }


    @Override
    public String toString() {
        return "Error{" +
                "description='" + description + '\'' +
                '}';
    }
}
