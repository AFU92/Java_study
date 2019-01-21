package com.afu.repaso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;

public class Person {

	public Person(String firstName, String lastname, String identification, LocalDate birthDate) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.identification = identification;
		this.birthDate = birthDate;
		this.calculateAge();
		this.myPets=new ArrayList<Pet>();
	}

	public Person(String firstName, String lastname, String address, String identification, LocalDate birthDate,
			float heightMts, String phoneNumb) {

		this.firstName = firstName;
		this.lastname = lastname;
		this.address = address;
		this.identification = identification;
		this.birthDate = birthDate;
		this.heightMts = heightMts;
		this.phoneNumb = phoneNumb;
		this.calculateAge();
	}

	private String firstName;
	private String lastname;
	private String address;
	private String identification;
	private int age;
	private LocalDate birthDate;
	private float heightMts;
	private String phoneNumb;
	private ArrayList<Pet> myPets;

	public ArrayList<Pet> getMyPets() {
		return myPets;
	}

	public void setMyPets(ArrayList<Pet> myPets) {
		this.myPets = myPets;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
		this.calculateAge();
	}

	public float getHeightMts() {
		return heightMts;
	}

	public void setHeightMts(float heightMts) {
		this.heightMts = heightMts;
	}

	public String getPhoneNumb() {
		return phoneNumb;
	}

	public void setPhoneNumb(String phoneNumb) {
		this.phoneNumb = phoneNumb;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.firstName + "\nLast name: " + this.lastname + "\nAge: " + this.age + "\nBirth date: "
				+ this.birthDate;
	}

	private void calculateAge() {
		LocalDate dateNow = LocalDate.now();
		this.age = dateNow.compareTo(this.birthDate);
		
		if (this.birthDate.getDayOfYear()>dateNow.getDayOfYear()) {
			this.age--;
		}
	}
	
	/**
	 * Metodos de Mascotas de la persona
	 */
	
	public Pet createPet(String name, String animalType, LocalDate birthDate, String color) { // Recibir parametros

		Pet newPet = new Pet(name, animalType, birthDate, color); // Crear el objeto
		this.myPets.add(newPet); // Agregando a la colección 
		return newPet; 
	}
	
	public Optional<Pet> getPetById (int id) {
		// Para cada mascota de esta lista
		for(Pet p : myPets) {
			if (id == p.getId()) {
				return Optional.of(p);
			} 
		}
		return Optional.empty();
	}
	
	public ArrayList<Pet> getPetByName (String name) { //Va a devolver una lista de mascotas
		
		ArrayList<Pet> foundPets = new ArrayList<Pet>(); // Inicializar lista de perros encontrados
		
		for(Pet p : myPets) {
			if (p.getName().matches(".*" + name + ".*")) {
				foundPets.add(p);
			}
		}
		return foundPets;		
	}
	// public:modificadorDeAcceso String:TipoDatoQueDevuelve updatePed:NombreDelMetodo (int...):ParametrosQueRecibe
	public String updatePet (int id, String name, String animalType, LocalDate birthDate, String color) {
		
		Optional<Pet> findedPet = getPetById(id);
		
		if (findedPet.isPresent()== false) {
			return "Pet not found xD";
		}
		Pet petGetted = findedPet.get();
		int indPet = myPets.indexOf(petGetted);
		
		petGetted.setName(name);
		petGetted.setAnimalType(animalType);
		petGetted.setBirthDate(birthDate);
		petGetted.setColor(color);
		
		myPets.set(indPet, petGetted);
				
		return "Pet succesfully updated";
	}
	
	public String deletePet (int id) {
		
		Optional<Pet> findedPet = getPetById(id);
		
		if (findedPet.isPresent()== false) {
			return "Pet not found D:";
		}
		
		myPets.remove(findedPet.get());
		
		return "Pet succesfully deleted";
	}
	
}
