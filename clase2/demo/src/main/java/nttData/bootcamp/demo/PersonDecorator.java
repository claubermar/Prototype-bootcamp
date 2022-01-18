package nttData.bootcamp.demo;

//declaracion prototipo Decorator
public class PersonDecorator {

	private Person persona;
	
	public PersonDecorator(Person persona) {
		this.persona = persona;
	}
	
	public String getName() {
		return "Nombre: " + this.persona.getName();
	}
	
	public int getAge() {
		return persona.getAge()*25;
	}
}
