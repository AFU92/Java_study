package com.afu.repaso;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//1. Crear una persona
		
		//2. Crear tres mascotas para esa persona
		
		//3. Buscar una mascota por ID
		
		//4. Buscar una mascota por nombre
		
		//5. Actualizar
		
		//6. Eliminar
		Person p = new Person("Daniel", "Torres", "Test 123", "12349232", LocalDate.of(1991, 3, 14), 1.75F, "313892439043");
		p.createPet("Nena", "Dog", LocalDate.of(2010, 9, 11), "White");
		p.createPet("Lucy", "Dog", LocalDate.of(2009, 9, 11), "Gray");
		Optional<Pet> nena = p.getPetById(1);
		
		System.out.println(nena.get());
		System.out.println(p.getPetByName("ucy"));
	}
}