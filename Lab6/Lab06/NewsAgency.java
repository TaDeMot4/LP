public class NewsAgency{
    News[] news;
    int newsCount;

    public NewsAgency(){
        this.news = new News[200];
        this.newsCount = 0;
    }
    
    public boolean addNews(News newsItem){
        if (newsCount < 200){
            news[newsCount++] = newsItem;
            return true;
        } else{
            System.out.println("O limite de noticias foi atingido.");
            return false;
        }
    
    }
    
    public void showPublishedNews(){
        boolean foundPublished = false;
        for (int i = 0; i < newsCount; i++){
            if (news[i].getDateOfPublication() != null){
                news[i].display();
                foundPublished = true;
            }
        }
        if (!foundPublished){
           System.out.println("Não existem notícias publicadas.");
        }
        
    }
    
    public void showNewsByAuthor(String authorName){
        boolean found = false;
        for (int i=0; i < newsCount; i++){
            if (news[i].getAuthorName().equals(authorName) && news[i].isPublished()){
                news[i].display();
                found = true;
            }else {
                System.out.println("Não há noticias publicadas para o autor" + authorName + ".");
            }
        } 
        
    }
}
