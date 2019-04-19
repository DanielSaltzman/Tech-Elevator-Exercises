
package com.techelevator.npgeek.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Survey{
	
private int favorited;
private String imagecode;
	
public String getImagecode() {
	return imagecode;
}
public void setImagecode(String imagecode) {
	this.imagecode = imagecode;
}
public int getFavorited() {
	return favorited;
}
public void setFavorited(int favorited) {
	this.favorited = favorited;
}
@NotBlank(message="Please select a park")
private String parkcode;

@NotBlank(message="Email address is required")
@Email(message="Email must be a valid email address")
private String emailaddress;

@NotBlank(message="Please select your state of residency")
private String state;

@NotBlank(message="Please select your activity level")
private String activitylevel;

public String getParkcode() {
	return parkcode;
}
public void setParkcode(String parkcode) {
	this.parkcode = parkcode;
}
public String getEmailaddress() {
	return emailaddress;
}
public void setEmailaddress(String emailaddress) {
	this.emailaddress = emailaddress;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getActivitylevel() {
	return activitylevel;
}
public void setActivitylevel(String activitylevel) {
	this.activitylevel = activitylevel;
}


}