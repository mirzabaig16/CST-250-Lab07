
public class MainClass
{
	public static void main(String[] args) {
		User u1 = new User("Aitzaz" ,"Abu Dhabi");
		u1.tweet("this is my First Tweet").display();
		User u2 = new User("Joe");
		u2.tweet("Hi! this is joe...").display();
		User u3 = new User("Lilly" ,"Chicago");
		u3.tweet("Hello World").display();
		
	}
}
