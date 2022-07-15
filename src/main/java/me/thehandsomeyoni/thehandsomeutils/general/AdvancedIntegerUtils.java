package me.thehandsomeyoni.thehandsomeutils.general;

public class AdvancedIntegerUtils {

    // roots of a quadratic equation.
    public static int[] rootsOfQuadraticEquation(int a, int b, int c) {
        int[] roots = new int[2];
        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            throw new IllegalArgumentException("The equation has no real roots");
        }
        roots[0] = (int) ((-b + Math.sqrt(d)) / (2 * a));
        roots[1] = (int) ((-b - Math.sqrt(d)) / (2 * a));
        return roots;
    }

    // pythagorean theorem.
    public static int pythagoreanTheorem(int a, int b) {
        return (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    // pythagoras theorem with a hypotenuse.
    public static int pythagorasTheorem(int hypotenuse, int side) {
        return (int) Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(side, 2));
    }

    // calculate a triangle's area.
    public static int triangleArea(int base, int height) {
        return base * height / 2;
    }

    // calculate a triangle's perimeter.
    public static int trianglePerimeter(int base, int height) {
        return base + height + pythagoreanTheorem(base, height);
    }

    // calculate a rectangle's area.
    public static int rectangleArea(int width, int height) {
        return width * height;
    }

    // calculate a rectangle's perimeter.
    public static int rectanglePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    // calculate a circle's area.
    public static int circleArea(int radius) {
        return (int) (Math.PI * Math.pow(radius, 2));
    }

    // calculate a circle's perimeter.
    public static int circlePerimeter(int radius) {
        return (int) (2 * Math.PI * radius);
    }

    // calculate a sphere's volume.
    public static int sphereVolume(int radius) {
        return (int) (4 / 3 * Math.PI * Math.pow(radius, 3));
    }

    // calculate a sphere's surface area.
    public static int sphereSurfaceArea(int radius) {
        return (int) (4 * Math.PI * Math.pow(radius, 2));
    }

    // calculate a cylinder's volume.
    public static int cylinderVolume(int radius, int height) {
        return (int) (Math.PI * Math.pow(radius, 2) * height);
    }

    // calculate a cylinder's surface area.
    public static int cylinderSurfaceArea(int radius, int height) {
        return (int) (2 * Math.PI * radius * (radius + height));
    }

    // calculate a cone's volume.
    public static int coneVolume(int radius, int height) {
        return (int) (Math.PI * Math.pow(radius, 2) * (height / 3));
    }

    // calculate a cone's surface area.
    public static int coneSurfaceArea(int radius, int height) {
        return (int) (Math.PI * radius * (radius + Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2))));
    }

    // calculate a straight line's slope.
    public static int slope(int x1, int y1, int x2, int y2) {
        return (y2 - y1) / (x2 - x1);
    }

    // calculate a straight line's y-intercept.
    public static int yIntercept(int x1, int y1, int x2, int y2) {
        return y1 - (x1 * slope(x1, y1, x2, y2));
    }

    // calculate a straight line's x-intercept.
    public static int xIntercept(int x1, int y1, int x2, int y2) {
        return x1 - (y1 * slope(x1, y1, x2, y2));
    }

    // calculate a straight line with two points.
    public static int straightLine(int x1, int y1, int x2, int y2, int x) {
        return slope(x1, y1, x2, y2) * x + yIntercept(x1, y1, x2, y2);
    }

    // calculate vector's magnitude.
    public static int vectorMagnitude(int x, int y) {
        return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    // calculate vector's angle.
    public static int vectorAngle(int x, int y) {
        return (int) (Math.atan2(y, x) * 180 / Math.PI);
    }


    // sinus.
    public static int sinus(int angle) {
        return (int) Math.sin(angle * Math.PI / 180);
    }

    // cosinus.
    public static int cosinus(int angle) {
        return (int) Math.cos(angle * Math.PI / 180);
    }

    // tangens.
    public static int tangens(int angle) {
        return (int) Math.tan(angle * Math.PI / 180);
    }

    // cotangens.
    public static int cotangens(int angle) {
        return (int) (1 / Math.tan(angle * Math.PI / 180));
    }

    // secans.
    public static int secans(int angle) {
        return (int) (1 / Math.cos(angle * Math.PI / 180));
    }

    // cosecans.
    public static int cosecans(int angle) {
        return (int) (1 / Math.sin(angle * Math.PI / 180));
    }

}
