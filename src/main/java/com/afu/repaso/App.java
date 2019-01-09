package com.afu.repaso;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>();
		String lineText = "";

		Person person1 = new Person("Andrea", "Fuentes", "1090448114", LocalDate.of(1992, 4, 9));
		personList.add(person1);
		Person person2 = new Person("Daniel", "Torres", "Cll 145-46-61", "1090431860", LocalDate.of(1991, 3, 14), 1.79f,
				"5555555");
		personList.add(person2);
		
		System.out.println(person1);
		System.out.println(person2);
		
		System.out.println(personList.size());
		
		System.out.println(personList.toString());
		
		for(int i=0;i<personList.size();i++) {
			lineText += "....................\n"+personList.get(i).toString()+"\n";
		}
		
		System.out.println(lineText);
		
		lineText="";
		for(Person p : personList) {
			lineText += "--------------------------\n" + p.toString();
		}
		System.out.println(lineText);
		
	}
}