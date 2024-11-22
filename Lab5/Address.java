

public class Address
{
    // instance variables - replace the example below with your own
    private String street;
    private int  doorNumber;
    private String zipCode;

    /**
     * Constructor for objects of class Address
     */
    public Address(String aStreet, int adoorNumber, String aZipCode)
    {
        this.street = aStreet;
        this.doorNumber = adoorNumber;
        this.zipCode = aZipCode;
    }

    public String show()
    {
        return(street + "" + doorNumber + "" + zipCode);
    }
    
    
}
