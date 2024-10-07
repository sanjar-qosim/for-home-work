package org.example;

public class Main {
    public static void main(String[] args) {

        double rectangleHeight = 5;
        double rectangleWidth = 10;

        double resOfPerimeter = (rectangleWidth + rectangleHeight) * 2;
        System.out.println("Периметер квадрата: " + resOfPerimeter);

        double eachSizeOfRectangle = (resOfPerimeter / 4);
        double resOfArea = eachSizeOfRectangle * eachSizeOfRectangle;
        System.out.println("Площадь квадрата: " + resOfArea);


        double pi = 3.14;
        double radiusOfCircle = 10;
        double diameterOfCircle = radiusOfCircle * 2;

        double areaOfCircleWithDiameter = ((diameterOfCircle * diameterOfCircle) / 4) * pi;

        double areaOfCircleWithRadius =  pi * (radiusOfCircle * radiusOfCircle);

        System.out.println("Площадь круга через радиус: " + areaOfCircleWithRadius);
        System.out.println("Площадь круга через диаметер: " + areaOfCircleWithDiameter);





    }
}