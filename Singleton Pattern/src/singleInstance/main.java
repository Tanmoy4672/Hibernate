package singleInstance;

public class main {

	public static void main(String[] args) {
		
		//illigal object declaration when method and instance are static 
		//SingleObject object = new SingleObject();
		
		
		SingleObject object = SingleObject.getInstance();
		object.messageShow();
		
	}
}
