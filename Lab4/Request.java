public class Request
{
    String typeRequest;
    Authorisation Authorisation;
    Authorisation firstAuthorisation;
    Authorisation secondAuthorisation;
    Person person;
    MyDate creatingDate;
    MyDate conclusionDate;
    //// duvida só funciona quando escrevo null ? 
    //// deveria fazer outro construtor que nao recebe data por padrao?
    public Request(String typeRequest,Person person,MyDate creatingDate)
    {
        this.typeRequest = typeRequest;
        this.person = person;
        if (creatingDate == null){
            this.creatingDate = new MyDate(1, 1, 2000);
        }
        else{
            this.creatingDate = creatingDate;
        }
    }
    public String gettypeRequest(){
        return typeRequest;
    }
    
    public String getperson(){
        return person.getname();
    }
    
    public Authorisation getfirstAuthorisation(){
        return firstAuthorisation;
    }
    
    public Authorisation getsecondAuthorisation(){
        return secondAuthorisation;
    }
    
    public MyDate getconclusionDate(){
        return conclusionDate;
    }
    
    public MyDate getcreatingDate(){
        return creatingDate;
    }
    
    public boolean authorizationVerify(){
        if(getfirstAuthorisation() == null || getsecondAuthorisation() == null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean addAuthorisation(Authorisation authorisation){
        if(authorisation.getauthorisingPerson().getLevel() > person.getLevel()){
            if(firstAuthorisation == null){
                firstAuthorisation = authorisation;
                return true;
            }
            else if (secondAuthorisation == null){
                secondAuthorisation = authorisation;
                conclusionDate = authorisation.getauthorisationDate().getCurrentDate();
                return true;
            }
            return true;
        
        }
        return false;
    }
    
    public void show(){
        if(authorizationVerify() == true){
            System.out.println(getperson()+"["+gettypeRequest()+"] - "+getcreatingDate()+" - autorizado em "+getconclusionDate());
            }
        else{
            System.out.println(getperson()+"["+gettypeRequest()+"] - "+getcreatingDate()+" - pendente");
        }
    }
}
