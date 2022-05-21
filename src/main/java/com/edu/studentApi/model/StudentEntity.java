package com.edu.studentApi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentDetails")
public class StudentEntity {

	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		@Column(name="first_Name")
		private String firstName;
		@Column(name="last_Name")
		private String lastName;
		@Column(name="email")
		private String email;
		@Column(name="phone")
		private String phone;
		@Column(name="age")
		private int age;
		@Column(name="zipcode")
		private String zipcode;
		@Column(name="city")
		private String city;
		@Column(name="country")
		private String country;
		
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


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhone() {
			return phone;
		}


		public void setPhone(String phone) {
			this.phone = phone;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getZipcode() {
			return zipcode;
		}


		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}

	}

