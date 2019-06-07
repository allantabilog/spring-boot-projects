package au.com.redenergy.data

class Customer {
    private long id
    private String firstName
    private String lastName

    Customer() {
    }

    Customer(long id, String firstName, String lastName) {
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
    }

    long getId() {
        return id
    }

    void setId(long id) {
        this.id = id
    }

    String getFirstName() {
        return firstName
    }

    void setFirstName(String firstName) {
        this.firstName = firstName
    }

    String getLastName() {
        return lastName
    }

    void setLastName(String lastName) {
        this.lastName = lastName
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
