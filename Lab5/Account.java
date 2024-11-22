
public class Account
{
    int accId;
    double accBalance;
    Customer accCustomer;
    Address accAddress;
    public Account(int accId, double accBalance, Customer accCustomer,Address accAddress){
        this.accId = accId;
        this.accBalance = accBalance;
        this.accCustomer = accCustomer;
        this.accAddress = accAddress;
    }
    
    public Account(int accId, Customer accCustomer){
        this.accId = accId;
        this.accBalance = 0.0;
        this.accCustomer = accCustomer;
        this.accAddress = null;
    }
    
    public void setAccId(int newaccId){
        this.accId = newaccId;
    }
    
    public int getAccId(){
        return accId;
    }
    
    public void SetAccBalance(double accBalance){
        if(accBalance>0){this.accBalance = accBalance;
        }else{System.out.println("you can only set positive balance values");
        }
    }
    
    public double getAccBalance(){
        return accBalance;
    }
    
    public void Accountdeposit(double amount){
        SetAccBalance(getAccBalance()+amount);
    }
    
    public void withdraw(double amount){
        if(getAccBalance()>=amount){SetAccBalance(getAccBalance()-amount);
        }
        else{
        System.out.println("you cannot raise money, because your balance is not enough");
        }
    }
    
    public void setCustomer(Customer customer){
        if(customer != null){this.accCustomer = customer;
    }else{
        System.out.println("you can only set valid customers");
        }
    }
    
    public Customer getCustomer(){
        if(accCustomer != null){
            return accCustomer;
        }
        return null;
    }
    
    public String getNameCustomer(){
        if(accCustomer != null){
            return accCustomer.getName();
        }
        return "there's no valid client";
    }
    
    public void show (){
        System.out.println(accId + "" + accBalance + "" + accCustomer + "" + accAddress);
    }
    
    public String showAddress(){
        return accAddress.show();
    }
    
    public void updateAddress(Address aAddress){
        if(accAddress != null){this.accAddress = aAddress;
        }else{
            System.out.println("this account doesn't have any address");
        }
    }
    
}
