package Tester.s3.home_work;

public class UserData {
    private String surName;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String phoneNumber;
    private String gender;

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserData(String surName, String firstName, String lastName, String dateOfBirth, String phoneNumber, String gender) {
        this.surName = surName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name:\t\t\t" + surName + ' ' + firstName + ' ' + lastName + '\n' +
                "DateOfBirth:\t" + dateOfBirth + '\n' +
                "PhoneNumber:\t" + phoneNumber + '\n' +
                "Gender:\t\t\t" + gender + '\n' + '\n';
    }
}
