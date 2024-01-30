package ru.gb_tasks.s3.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cube> cubeList = new ArrayList<>(Arrays.asList(
                new Cube(3, "белый", "дерево"),
                new Cube(5, "красный", "металл"),
                new Cube(6, "белый", "картон"),
                new Cube(3, "зелёный", "дерево")
        ));
        int countColor = 0;
        int countMaterial = 0;
        int sum = 0;
        for (int i = 0; i < cubeList.size(); i++) {
            if (cubeList.get(i).getColor().equals("белый")) {
                countColor++;
                sum += cubeList.get(i).getVolume();
            }
            if (cubeList.get(i).getMaterial().equals("дерево") && cubeList.get(i).getLenght() == 3){
                countMaterial++;
            }
        }
        System.out.println("countColor = " + countColor);
        System.out.println("sum = " + sum);
        System.out.println("countMaterial = " + countMaterial);
    }
}
