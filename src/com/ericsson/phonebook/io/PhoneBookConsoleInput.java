package com.ericsson.phonebook.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBookConsoleInput implements PhoneBookInput {
	BufferedReader br;

	PhoneBookConsoleInput() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String readName() {
		String name = null;
		try {
			name = br.readLine();
		} catch (IOException e) {

		}
		return name;
	}

	public String readPhoneNum() {
		String phoneNum = null;

		try {
			phoneNum = br.readLine();
		} catch (IOException e) {

		}
		return phoneNum;
	}

	public void dispose() {
		try {
			br.close();
		} catch (IOException e) {

		}
	}
}
