import java.time.Instant;

public class Tweet{
    private String text;
    private String datetime;
    private User author;
    
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    
    public String getDatetime(){
        return datetime;
    }
    public void setDatetime(String datetime){
        this.datetime = datetime;
    }
    
    public User getAuthor(){
        return author;
    }
    public void setAuthor(User author){
        this.author = author;
    }
    
    public Tweet(String text , String datetime,User author){
        this.text = text;
        this.datetime = datetime;
        this.author= author;
    }
     public Tweet(String text ,User author){
        this.text = text;
        this.datetime = Instant.now().toString();
        this.author= author;
    }
    
    public void display(){
        
        System.out.println("________________________________");
        if(this.author.getLocationSet()){
            System.out.println(this.author.getName()+" from "+this.author.getLocation()+":");
        }
        else{
        System.out.println(this.author.getName()+":");
        }
        System.out.println(this.text);
        System.out.println(this.datetime);
        System.out.println("________________________________");
    }
}