package com.demo.builderpattern2;

import java.time.LocalDate;
import java.time.Period;

import com.demo.builderpattern.Address;
import com.demo.builderpattern.UserDTOBuilder;
import com.demo.builderpattern.UserWebDTO;

//import com.demo.builderpattern.UserDTOBuilder;

public class UserDTO {
	
	private String name;
	private String address;
	private String age;
	
	
	
//	public UserDTO(String name, String address, String age) {
//		super();
//		this.name = name;
//		this.address = address;
//		this.age = age;
//	}

	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	private void setAddress(String address) {
		this.address = address;
	}
	
	public String getAge() {
		return age;
	}
	
	private void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	//This method will return the builder instance
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}
	
	//Builder class
	public static class UserDTOBuilder{
		
		private String firstName;
		private String lastName;
		private String age;
		private String address;
		private UserDTO userDTO;
		
		
		public UserDTOBuilder withFirstName(String fname) {
			firstName = fname;
			return this;
		}

		
		public UserDTOBuilder withLastName(String lname) {
			lastName = lname;
			return this;
		}

		
		public UserDTOBuilder withBirthday(LocalDate date) {
			Period ageInYears = Period.between(date, LocalDate.now());
			age = Integer.toString(ageInYears.getYears());
			return this;
		}

		
		public UserDTOBuilder withAddress(Address address) {
			this.address = address.toString();
			return this;
		}

		
		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(firstName+" "+lastName);
			userDTO.setAddress(address);
			userDTO.setAge(age);
			return this.userDTO;
		}
		
		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
