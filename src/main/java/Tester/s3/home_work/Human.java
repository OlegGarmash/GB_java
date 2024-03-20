package Tester.s3.home_work;

public class Human {
    String surName;
    String firstName;

    String lastName;
    String dateOfBirth;
    String phoneNumber;
    String gender;

    public Human(String surName, String firstName, String lastName, String dateOfBirth, String phoneNumber, String gender) {
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
                "Gender:\t\t\t" + gender + '\n'+'\n';
    }

//    @Override
//    public String toString() {
//        return surName + " " + firstName + " " + lastName + " " + dateOfBirth + " " + phoneNumber + " " + gender + '\n';
//    }
}
