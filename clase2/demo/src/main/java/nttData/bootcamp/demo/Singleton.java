package nttData.bootcamp.demo;

public class Singleton {
	
	private static Person INSTANCE;
	
	public static Person getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Person();
		}
		return INSTANCE;
	}

}
