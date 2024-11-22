public class TransportPass
{
    String passType;
    double price;
    
    public TransportPass()
    {
        this.passType = "Jovem";
        this.price = 10.0;
    }

   public TransportPass(String newPassType, double newPrice)
   {
        this.passType = newPassType;
        this.price = newPrice;
   }
   
   public String getpassType()
   {
        return this.passType;
   }
   
   public double getprice()
   {
       return this.price;
   }
   
   public void setpassType(String pass2)
   {
       this.passType = pass2;
   }    
   
   public void setPrice(double preço)
   {
       this.price = preço;
   }
}
