
public class Customer {

	private String identityNumber;
	private String firstName;
	private String lastName;
	private String birthYear;

	public Customer(String identityNumber, String firstName, String lastName,
			String birthYear) {

		this.identityNumber = identityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
	}


	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
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

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

}
