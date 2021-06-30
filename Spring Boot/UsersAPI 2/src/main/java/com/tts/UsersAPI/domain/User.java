package com.tts.UsersAPI.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@Size(max = 20)
private String firstName;
@Size(min = 2)
private String lastName;
@Size(min = 4, max = 20)
private String stateResidence;
/**
 * @param id
 * @param firstName
 * @param lastName
 * @param stateResidence
 */
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getStateResidence() {
	return stateResidence;
}
public void setStateResidence(String stateResidence) {
	this.stateResidence = stateResidence;
}


}
