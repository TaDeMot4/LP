public class Authorisation
{
    MyDate authorisationDate;
    Person authorisingPerson;
    public Authorisation(MyDate authorisationDate, Person authorisingPerson)
    {
        this.authorisationDate = authorisationDate;
        this.authorisingPerson = authorisingPerson;
    }
    
    public MyDate getauthorisationDate(){
        return authorisationDate;
    }
    
    public Person getauthorisingPerson(){
        return authorisingPerson;
    }
    
    public String toString() {
        return "Autorização dada por " + authorisingPerson + " em " + authorisationDate;
    }
}
