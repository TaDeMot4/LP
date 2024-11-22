 

public class Customer {

    private int id;
    private String name;
    private double discount;

    public Customer(int aId, String aName, double aDiscount) {
        super();
        id = aId;
        name = aName;
        discount = aDiscount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

  
    public void show() {
        System.out.println( "name(" + id + ")(" + discount + ")");
    }
}
