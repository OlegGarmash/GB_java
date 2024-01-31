package ru.gb_tasks.s2.task04_home_work;

public class Main {
    static class Answer {
        public static StringBuilder answer(String QUERY, String PARAMS) {
            // Напишите свое решение ниже
            StringBuilder queryBuilder = new StringBuilder(QUERY);
            PARAMS = PARAMS.trim().replaceAll("^\\{", "").replaceAll("\\}$", "");
            String[] pairs = PARAMS.split(",");

            boolean isFirstParam = true;

            for (String pair : pairs) {
                String[] keyValue = pair.split(":");
                String key = keyValue[0].trim().replaceAll("\"", "");
                String value = keyValue[1].trim().replaceAll("\"", "");

                if (!value.equals("null")) {
                    if (!isFirstParam) {
                        queryBuilder.append(" and ");
                    }
                    queryBuilder.append(key).append("='").append(value).append("'");
                    isFirstParam = false;
                }
            }
            return queryBuilder;
        }
    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
        public static void main(String[] args) {
            String QUERY = "";
            String PARAMS = "";

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                QUERY = "select * from students where ";
                PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
            } else {
                QUERY = args[0];
                PARAMS = args[1];
            }

            Answer ans = new Answer();
            System.out.println(ans.answer(QUERY, PARAMS));
        }
    }
}
