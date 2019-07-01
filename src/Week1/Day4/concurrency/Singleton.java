package Week1.Day4.concurrency;

public class Singleton {

	private static Singleton singleton = new Singleton();
	private String message = "Initial Message";
	
	private Singleton() {
		System.out.println("Singleton class created");
	}
	
	//Thread safe 
	public static synchronized Singleton getInstance() {
		return singleton;
	}
	
	
	public String getMessage() {
        return message;
    }	 
	
    public void setMessage(String message) {
        this.message = message;
    } 
	
	
}
