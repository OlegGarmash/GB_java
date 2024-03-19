package Tester.s3.home_work;

public class Human {
    String firstName;
    String surName;
    String lastName;
    String dateOfBirth;
    String phoneNumber;
    String gender;

    public Human(String firstName, String surName, String lastName, String dateOfBirth, String phoneNumber, String gender) {
        this.firstName = firstName;
        this.surName = surName;
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
                "Gender:\t\t\t" + gender + '\n';
    }
}
