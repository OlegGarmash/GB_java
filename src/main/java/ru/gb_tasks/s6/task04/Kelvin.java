package ru.gb_tasks.s6.task04;

public class Kelvin extends Converter {
    /**
     *
     * @param value температура в Цельсиях
     * @return температура в Кельвинах
     */
    @Override
    public double convertValue(double value) {
        return value + 273.15;
    }
}
