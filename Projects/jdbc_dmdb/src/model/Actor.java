package model;


import java.sql.Date;

public class Actor {
	private int Id;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String Gender;

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param birthDate
	 * @param gender
	 */
	public Actor(int id, String firstName, String lastName, Date birthDate, String gender) {
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		Gender = gender;

	}

	@Override
	public String toString() {
		return "Actor [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", Gender=" + Gender + "]";
	}

	/**
	 * 
	 */
	public Actor() {
		// TODO Auto-generated constructor stub
	}

}
