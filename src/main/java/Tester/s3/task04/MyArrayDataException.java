package Tester.s3.task04;

import java.util.List;

public class MyArrayDataException extends IllegalArgumentException{
    public MyArrayDataException(int i , int j){
        super(String.format("The value in the cell [%s][%s] is not a number", i, j));
    }
    public MyArrayDataException(List<Point2D> points){
        super(String.format("The value in the cell %s are not points", points));
    }
}
