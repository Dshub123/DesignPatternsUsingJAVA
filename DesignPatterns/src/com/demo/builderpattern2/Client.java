package com.demo.builderpattern2;

import java.time.LocalDate;

import com.demo.builderpattern.Address;
import com.demo.builderpattern.User;
import com.demo.builderpattern2.UserDTO.UserDTOBuilder;  

public class Client {

	public static void main(String[] args) {
		
		User user = createUser();
		
		//Client has to provide director with concrete builder
		UserDTO dto = directorBuild(UserDTO.getBuilder(),user);
		System.out.println(dto);
	}
	
	/*
	 This method serves as the role of director in the builder pattern. 
	 */
	private static UserDTO directorBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthday(user.getBirthday())
				.build();

	}
	
	/*
	 This method returns a simple user object;
	 */
	public static User createUser() {

		User user = new User();
		user.setBirthday(LocalDate.of(1998,6,22));
		user.setFirstName("Shubham");
		user.setLastName("Diddi");
		Address address = new Address();
		address.setHouseNumber("29");
		address.setStreet("beed by pass road");
		address.setCity("Aurangabad");
		address.setState("Maharashtra");
		address.setZipcode("431010");
		user.setAddress(address);

		return user;
	}


}
