package au.com.redenergy.data

class NullCustomer extends Customer{
    private NullCustomer() {
        super(0, 'Unknown', 'Unknown')
    }

    static Customer get() {
        return new Customer(-1, null, null)
    }


}
