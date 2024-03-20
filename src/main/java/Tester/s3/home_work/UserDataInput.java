package Tester.s3.home_work;

import java.util.Scanner;

public class UserDataInput {
    public void userDataInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите данные (ФИО, дата рождения, номер телефона, пол) через пробел в формате:\n" +
                "Фамилия Имя Отчество 00.00.0000 81234567890 M\\F\n" +
                "-> ");
        String[] inputData = scanner.nextLine().split(" ");
        try {
            UserData data = new UserData(inputData[0], inputData[1], inputData[2], inputData[3], inputData[4], inputData[5]);
            if (!inputData[0].matches("[a-zA-Zа-яА-Я\\-]+") || !inputData[1].matches("[a-zA-Zа-яА-Я\\-]+") || !inputData[2].matches("[a-zA-Zа-яА-Я\\-]+")) {
                throw new RuntimeException("Некорретный ввод фимилии, имени или отчества");
            }
            if (!inputData[3].matches("\\d{2}.\\d{2}.\\d{4}")) {
                throw new RuntimeException("Некорретный ввод даты рождения.");
            }
            if (!inputData[4].matches("[0-9]+")) {
                throw new RuntimeException("Некорретный ввод номера телефона.");
            }
            if (!inputData[5].equalsIgnoreCase("m") && !inputData[5].equalsIgnoreCase("f")) {
                throw new RuntimeException("Некорретный ввод пола.");
            }
            new WriteToFile().writeToFile(data.getSurName(), data);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Введенно некорректное количество данных");
        }
    }
}
