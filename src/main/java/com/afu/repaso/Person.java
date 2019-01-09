package com.afu.repaso;

import java.time.LocalDate;
import java.util.ArrayList;

public class Person {

	public Person(String firstName, String lastname, String identification, LocalDate birthDate) {
		this.firstName = firstName;
		this.lastname = lastname;
		this.identification = identification;
		this.birthDate = birthDate;
		this.calculateAge();
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
	
	
}
