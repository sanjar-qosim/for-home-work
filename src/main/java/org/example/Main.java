package org.example;

public class Main {
    public static void main(String[] args) {




    }

    private double calculatePerimeterOfRectangle(double height, double width){
        double resOfPerimeter = (height + width) * 2;
        return resOfPerimeter;
    }

    private double calculateSizeOfRectangle(double perimeter){
        double eachSizeOfRectangle = perimeter / 4;
        double resOfArea = eachSizeOfRectangle * eachSizeOfRectangle;
        return resOfArea;
    }

    private double calculateOfCircleWithRadius(double radius){
        double resOfCircleArea =  Math.PI * (radius * radius);
        return resOfCircleArea;
    }

    private double calculateOfCircleWithDiameter(double radius){
        double resOfDiameter = radius * 2;
        double resOfCircle = ((resOfDiameter * resOfDiameter) / 4) * Math.PI;
        return resOfCircle;
    }

}