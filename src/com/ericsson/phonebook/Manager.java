package com.ericsson.phonebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manager {
	public static void main(String[] args) {

		System.out.println("Welcome to my PhoneBook!");
		PhoneBook pb = new PhoneBook();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line;
			System.out
					.println("Input your command(0,quit;1,add a contact person;2,list all contact person:");
			line = br.readLine();

			while (line != null && !"0".equals(line)) {
				int cmd = Integer.valueOf(line);
				switch (cmd) {
				case 1:
					PhoneBook.ContactPerson conPerson = pb.new ContactPerson();

					System.out.println("Please input your name:");
					line = br.readLine();
					conPerson.name = line;

					System.out.println("Please input your phone number:");
					line = br.readLine();
					conPerson.phoneNum = line;

					pb.addOnePerson(conPerson);
					break;
				case 2:
					pb.listAllPerson();
					break;
				default:
					break;
				}

				System.out
						.println("Input your command(0,quit;1,add a contact person;2,list all contact person:");
				line = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
			System.err.println(e.toString());
		}

	}
}
