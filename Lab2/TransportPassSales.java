public class TransportPassSales
{
  int numberOfTransportPassesSold;
  double totalValue;

  public TransportPassSales(int newNumberOfTransportPassesSold, double newTotalvalue)
  {
      this.totalValue = newTotalvalue;
      this.numberOfTransportPassesSold = newNumberOfTransportPassesSold ;
  }
  
  public void sellTransportPasses(double unityPrice, int numOfpassesSold)
  {
      this.numberOfTransportPassesSold += numOfpassesSold;
      this.totalValue += unityPrice;
  }
  
  public int getnumberOfTransportPassesSold()
 {
        return this.numberOfTransportPassesSold;
 }
   
  public double gettotalValue()
 {
        return this.totalValue;
 }

  public void showSales() 
 {
    System.out.println("Quantidade de passes vendidos: " + this.numberOfTransportPassesSold);
    System.out.println("Valor total arrecadado:" + String.format("%.2f", this.totalValue)+ "€"); 
 }
}
  
  
