package com.cg.emp.beans;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Employee {
		@Id
		private int id;
		@NotEmpty(message="Name is mandatory")
		@Pattern(regexp="[A-Z][A-Za-z]{2,}",message="Name start with capital letter")
		
		private String name;
		@Pattern(regexp="(Male|Female)", message="Gender should be male or female")
		private String gender;
		@Min(18)
		@Max(60)
		private int age;
		private double salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}

	}

