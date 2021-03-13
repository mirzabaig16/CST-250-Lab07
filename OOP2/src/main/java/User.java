public class User{
    private String name;
    private String location;
    private boolean locationSet;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
      public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    
    public boolean getLocationSet(){
        return this.locationSet;
    }
    public User(String name,String location){
        this.name = name;
        this.location = location;
        this.locationSet = true;
    }
      public User(String name){
        this.name = name;
        this.location = "No Location";
        this.locationSet = false;
    }
    
    public Tweet tweet(String text){
        
       return new Tweet(text, this);
        
    }
    
}