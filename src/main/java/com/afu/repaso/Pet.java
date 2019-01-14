package com.afu.repaso;

import java.time.LocalDate;

public class Pet {

	private static int nextId = 1;

	private int id;
	private String name;
	private String animalType;
	private LocalDate birthDate;
	private int age;
	private String color;

	public Pet(String name, String animalType, LocalDate birthDate, String color) {
		
		this.id=Pet.nextId++;
		this.name = name;
		this.animalType = animalType;
		this.birthDate = birthDate;
		this.color = color;
		this.calculateAge();
	}

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

	public int getId() {
		return id;
	}

	private void calculateAge() {
		LocalDate dateNow = LocalDate.now();
		this.age = dateNow.compareTo(this.birthDate);

		if (this.birthDate.getDayOfYear() > dateNow.getDayOfYear()) {
			this.age--;
		}
	}
}
