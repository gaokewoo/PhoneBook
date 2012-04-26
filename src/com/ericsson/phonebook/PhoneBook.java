package com.ericsson.phonebook;

import java.util.Iterator;
import java.util.Vector;

public class PhoneBook {

	class ContactPerson {
		public String name;
		public String phoneNum;
	}

	private static Vector<ContactPerson> contactVec = new Vector<ContactPerson>();

	void addOnePerson(ContactPerson person) {
		contactVec.add(person);
	}

	void listAllPerson() {
		for (ContactPerson tmp : contactVec) {
			System.out.println("Name:" + tmp.name);
			System.out.println("Phone Number:" + tmp.phoneNum);
		}
	}

	void deleteByName(String name){
		for (Iterator<ContactPerson> iter = contactVec.iterator(); iter.hasNext();) {
			ContactPerson tmp = (ContactPerson)iter.next();
			if(tmp.name.equals(name)){
				iter.remove();
				break;
			}
		}
	}
	
	void deleteByNumber(String num){
		for (Iterator<ContactPerson> iter = contactVec.iterator(); iter.hasNext();) {
			ContactPerson tmp = (ContactPerson)iter.next();
			if(tmp.phoneNum.equals(num)){
				iter.remove();
				break;
			}
		}
	}
}
