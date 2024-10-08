package org.example;

public class Main {
    public static void main(String[] args) {

        Main obj = new Main();

        double res1 = obj.calculatePerimeterOfRectangle(5, 10);
        System.out.println("Периметр квадрата: " + res1);

        double res2 = obj.calculateSizeOfRectangle(res1);
        System.out.println("Площадь прямоугольника: " + res2);

        double res3 = obj.calculateOfCircleWithRadius(10);
        System.out.println("Площадь круга через радиус: " + res3);

        double res4 = obj.calculateOfCircleWithDiameter(res3);
        System.out.println("Площадь круга через диаметр: " + res4);

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