package ru.gb_tasks.l1.task04;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"asdf", "asdfghj", "asdfcvb", "asdfrew"};

        if (strs.length == 0) {
            System.out.println("");
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int count = 0;
            int lastPos = 0;
            while (count < result.length() && lastPos < strs[i].length()) {
                if (result.charAt(count) == strs[i].charAt(count)) {
                    lastPos++;
                }
                count++;
            }
            result = result.substring(0, lastPos);
        }
        System.out.println("result = " + result);
    }
}
