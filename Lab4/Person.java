
public class Person
{
    private String name;
    private int level;
    
    public Person(String name)
    {
        this.name = name;
        this.level = 1;
    }

    public Person(String name, int level)
    {
        this.name = name;
        setlevel(level);
    }
    
    public void setname(String Newname){
        this.name = Newname;
    }
    
    public String getname(){
        return name;
    }
    
    public void setlevel(int level){
        if (level >= 1 && level <= 5) {
            this.level = level;
        } else {
            throw new IllegalArgumentException("O nível deve estar entre 1 e 5.");
        }
    }
    
    public int getLevel(){
        return level;
    }
    
    public String toString(){
        return getname()+" [Nível: "+getLevel()+"]";
    }
}
