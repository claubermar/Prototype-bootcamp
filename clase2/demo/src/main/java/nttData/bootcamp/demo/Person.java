package nttData.bootcamp.demo;

import nttData.bootcamp.demo.Person.PersonBuilder;

//Creación de la clase persona

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age= age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//CLONAR
	@Override
	public Person clone() {
		Person uno = new Person(this.name, this.age);
		return uno;
	}
	
	//BUILDER
	private Person (PersonBuilder personBuilder) {
		super();
		this.name = personBuilder.name;
		this.age = personBuilder.age;
	}
	
	public static class PersonBuilder{
		private String name;
		private int age;
		public PersonBuilder name(String name) {
			this.name = name;
			return this;
		}
		public PersonBuilder age (int age) {
			this.age = age;
			return this;
		}
		public Person buil() {
			return new Person(this);
		}
	}

	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	//PATRON PROXY
	
	public void operation() {
		System.out.println("Haciendo la operación");
	}
}
