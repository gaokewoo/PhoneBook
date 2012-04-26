package com.ericsson.phonebook.io;

import java.io.File;

public class PhoneBookTestOutput implements PhoneBookOutput {
	File path;
	
	PhoneBookTestOutput(File path){
		this.path = path;
	}
	
	PhoneBookTestOutput(String path){
		this.path = new File(path);
	}
	
	public void doOutput(){
		
	}
}
