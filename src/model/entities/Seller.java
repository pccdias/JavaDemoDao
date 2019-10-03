package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer Id;
	private String Name;
	private String email;
	private Date birthDate;
	private Double Salary;
	
	private Department department;
	
	public Seller(){
		
	}

	public Seller(Integer id, String name, String email, Date birthDate, Double salary, Department department) {
		Id = id;
		Name = name;
		this.email = email;
		this.birthDate = birthDate;
		Salary = salary;
		this.department = department;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [Id=" + Id + ", Name=" + Name + ", email=" + email + ", birthDate=" + birthDate + ", Salary="
				+ Salary + ", department=" + department + "]";
	}

}
