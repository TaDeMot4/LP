import java.util.ArrayList;

public class Club
{
    Membership member;
    ArrayList <Membership> members;
    public Club()
    {
         members = new ArrayList<Membership>();
    }
    
    public int numberOfMembers(){
        return members.size();
    }
    
    public void join (Membership member){
        if(member!=null){
            members.add(member);} 
    }
    
    public void numberJoinedInMonth(int month, int year){
        int numberJoined = 0;
        if(month >=1 && month <= 12){
            for(int i=0; i < numberOfMembers(); i++){
                if(month == members.get(i).getMonth() && year == members.get(i).getYear()){
                    numberJoined++;
                }
            }
            System.out.println("There are"+ numberJoined + "members who joined the club in" + month +"in"+ year);
        }
    }
    
    public void listJoinedInMonth(int month, int year){
        if(month >=1 && month <= 12){
            System.out.println("The members who joined the club in month" + month + "and"+ year +"are:");
            for(int i=0; i < numberOfMembers(); i++){
                if(month == members.get(i).getMonth() && year == members.get(i).getYear()){
                    System.out.println(members.get(i).getName());
                }
            }
        }
    }   
    
    public int search(String nameToSearch){
        int n = 0;
        for(int i = 0; i < numberOfMembers(); i++){
            if(members.get(i).getName().equals(nameToSearch)){
                n++;
            }
        }
        return n;
    }
    
    public  void remove(String nameToSearch){
        for(int i=0; i < numberOfMembers(); i++){
            if(members.get(i).getName().equals(nameToSearch)){
                members.remove(i);
                i--;
            }
        }
    }
}
