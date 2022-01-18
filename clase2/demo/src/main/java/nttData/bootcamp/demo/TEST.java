package nttData.bootcamp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TEST {
	
	public static void main(String[] args) {
		//Singleton
		System.out.println("--Uso de Singleton--");
		Singleton.getInstance().setAge(33);
		Singleton.getInstance().setName("Claudia");
		System.out.println(Singleton.getInstance());
		
		System.out.println("Me llamo " + Singleton.getInstance().getName() + " y teng " + Singleton.getInstance().getAge() + " años");
		
		//Prototype
		System.out.println("--Datos con Protoype--");
		Person persona1 = Person.builder().age(30).name("Miguel").buil();
		Person personaPrototype = persona1.clone();
		System.out.println("Me llamo " + persona1.getName() + " y mi dirección de memoria es " + persona1);
		System.out.println("Me llamo " + persona1.getName() + " y mi dirección de memoria es " + personaPrototype);
		System.out.println("\n");
		
		//Builder
	    System.out.println("--PATRON BUILDER--");
		Person personBuilder = Person.builder().age(45).name("Alfonso").buil();
		System.out.println("Nombre: " + personBuilder.getName());
		System.out.println("Edad: " + personBuilder.getAge());
		System.out.println("\n");
		
		//Decorator
		System.out.println("-- PATROn BUILDER--");
  		Person persona2 = new Person("Nando", 29);
  		PersonDecorator personaDecorator = new PersonDecorator(persona2);
  		System.out.println(personaDecorator.getName());
  		System.out.println(personaDecorator.getAge());
  		System.out.println("\n");
  		
  		//Proxy
  		/*System.out.println("--PATRON BUILDER--");
  		PersonProxy person4 = new PersonProxy((IPersonProxyInterface) persona1);
  		person4.operation();
  		System.out.println("\n");*/
		
  		//Responsability
  		System.out.println("--Responsability--");
 		Unit soldado = new Unit("soldado");
        Unit sargento = new Unit("sargento", soldado);
        Unit capitan = new Unit("capitan", sargento);
        capitan.executeCommand("Accion");
		}
	
		
}
	


	
	

