package com.qn.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="first_name")
		private String first_name;
		
		@Column(name="last_name")
		private String last_name;
		
		@Column(name="email")
		private String email;
		
		@ManyToMany(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
		@JoinTable(name="course_and_instructor",
					joinColumns=@JoinColumn(name="instructor_id"),
					inverseJoinColumns=@JoinColumn(name="course_id"))
		private List<Course> c;
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		public void addCourse(Course tempCourse) {
			if(c==null)
			{
				c=new ArrayList<Course>();
			}
			c.add(tempCourse);
		}

		////////////////////////////////////////////////////////////////////////////////////////////////////////////

		public Instructor(String first_name, String last_name, String email) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
			this.email = email;
		}

		public Instructor() {
			super();
		}

		////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public List<Course> getC() {
			return c;
		}

		public void setC(List<Course> c) {
			this.c = c;
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////


		@Override
		public String toString() {
			return "Instructor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email="
					+ email + "]";
		}
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
		
		
}
