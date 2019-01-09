package com.afu.repaso;

import java.time.LocalDate;

public class Pet {

	public Pet(String name, String animalType, LocalDate birthDate, int age, String color) {
		this.name = name;
		this.animalType = animalType;
		this.birthDate = birthDate;
		this.age = age;
		this.color = color;
		this.calculateAge();
	}
	
	private String name;
	private String animalType;
	private LocalDate birthDate;
	private int age;
	private String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
		this.calculateAge();
	}
	public int getAge() {
		return age;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	} 
	
	private void calculateAge() {
		LocalDate dateNow = LocalDate.now();
		this.age = dateNow.compareTo(this.birthDate);
		
		if (this.birthDate.getDayOfYear()>dateNow.getDayOfYear()) {
			this.age--;
		}
	}
}
