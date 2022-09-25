package singleInstance;

public class SingleObject {

	//create an object of a single object
	private static SingleObject instance;
	
	//make that constructor private so that this class cannot be instantiated
	private SingleObject() {
		
	}
	
	//get the only object available
	public static SingleObject getInstance() {
		if(instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}
	
	public void messageShow() {
		System.out.println("Hello World");
	}
}
//https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm
//https://www.youtube.com/watch?v=hUE_j6q0LTQ&list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc&index=6
