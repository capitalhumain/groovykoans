/**
 * Copyright 2012 The original author or authors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.groovykoans.koan03;

import java.io.Serializable;

/**
 * A simple POJO (Plain Old Java Object) representing a person.
 * First and last name can be modified, but ssn is forever.
 */
public class JavaPerson implements Serializable {

	private String firstName;
	private String lastName;
	private final String ssn;

	public JavaPerson(String firstName, String lastName, String ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	// ------------ START EDITING HERE ----------------------

	public String getFirstName() {
		return firstName;
	}

	// ------------ STOP EDITING HERE  ----------------------

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	// Since ssn cannot be modified, we only have a getter for this field
	public String getSsn() {
		return ssn;
	}
}
