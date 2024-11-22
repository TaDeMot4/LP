import java.util.ArrayList;
import java.util.List;

public class News
{
    String title;
    String text;
    Author author;
    Category category;
    Photo photo [];
    LocalDateTime dateOfPublication;
    List<String> photoFileName;
    int photoCount;
    
    public News(String title, String text, Author author, Category category){
        this.title = title;
        this.text = text;
        
        if (author != null){
            this.author = author;
        } else{
            this.author = new Author();
        }
            
        if (category != null){
            this.category = category;
        }
    
        photo = new Photo[20];
        this.dateOfPublication = null;
        this.photoFileName = new ArrayList<>(); 
    }
    
    public String getAuthorName() {
        return author.getName();
    }
    
    public LocalDateTime getDateOfPublication() {
        return dateOfPublication;
    }
    
    public void publish(){
        dateOfPublication = LocalDateTime.getLocalDateTime();
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getText(){
        return text;
    }
    
    public String getAuthor(){
        return author.getName();
    }
    
    public String getEmail(){
        return author.getEmail();
    }
    
    public Category getCategory(){
        return category;
    }
    
    public boolean addPhoto(Photo photo[]){
       for (int i=0; i<photo.length; i++){
           if (photo[i] != null){
                this.photo[i] = photo[i];
                return true;
            }
        }
        return false    ;
    } 
    
    public void display(){
        System.out.println("Categoria: "+ getCategory());
        System.out.println("Redação - "+ getEmail());
        System.out.println(getTitle());
        for (int i=0; i<photo.length; i++){
            System.out.println("[" + photo[i].getImageFile() + "]: " + photo[i].getImageFile());
        }
        
        if (dateOfPublication !=null){
            System.out.println("Data de publicação: " + dateOfPublication);
        }else{
            System.out.println("Data de publicação: Não publicada.");
        }
    }
    
    private int findPhotoFileName(String fileName){
        for(int i=0; i<photoFileName.size(); i++){
            if(photoFileName.get(i).equals(fileName)){
                return i;
            }
        }
        return -1;
    }
    
    public String findPhotoCaption(int index){
        if (index >= 0 && index < photoCount){
            return photo[index].getCaption();
        }
        return "Não tem foto";
    }
    
    public boolean isPublished(){
        return dateOfPublication != null;
    }
}