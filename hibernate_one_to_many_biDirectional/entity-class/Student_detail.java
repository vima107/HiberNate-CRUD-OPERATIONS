package com.qn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_detail")
public class Student_detail {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="branch")
		private String branch;
		
		@Column(name="hobby")
		private String hobby;
		
		@OneToOne(mappedBy="sd", cascade=CascadeType.ALL)
		private Student s;

		/////////////////////////////////////////////////////////////////////////////////////////////

		public Student_detail(String branch, String hobby) {
			super();
			this.branch = branch;
			this.hobby = hobby;
		}

		public Student_detail() {
			super();
		}
		/////////////////////////////////////////////////////////////////////////////////////////////

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		public Student getS() {
			return s;
		}

		public void setS(Student s) {
			this.s = s;
		}
		/////////////////////////////////////////////////////////////////////////////////////////////

		@Override
		public String toString() {
			return "Student_detail [id=" + id + ", branch=" + branch + ", hobby=" + hobby + "]";
		}

		
		/////////////////////////////////////////////////////////////////////////////////////////////

		
		
		
}
