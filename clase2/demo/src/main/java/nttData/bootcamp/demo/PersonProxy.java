package nttData.bootcamp.demo;

public class PersonProxy implements IPersonProxyInterface {
	
	private IPersonProxyInterface person;
	
	public PersonProxy (IPersonProxyInterface person) {
		this.person = person;
	}
	
	@Override
	public void operation() {
		before();
		this.person.operation();
		after();
	}
	
	public void before() {
		System.out.println("Realizado antes de la operación");
	}
	
	public void after() {
		System.out.println("Realizado después de la operación");
	}

}
