// 8. Creates a super class called Figure.Its defines a method called area() that computes the area of an object. The program derives two subclasses from Figure. The first is Rectangle and the second is Triangle. Each of these subclasses overrides area() so that it returns

class Figure {
      public double area(double l, double b) {
            double ar = l * l * b * b;
            return ar;
      }
}

class Rectangle extends Figure {
      @Override
      public double area(double l, double b) {
            double ar = l * b;
            return ar;
      }
}

class Triangle extends Figure {
      @Override
      public double area(double l, double b) {
            double ar = l * b / 2;
            return ar;
      }
}

public class Qeight {

      public static void main(String[] args) {
            Rectangle r = new Rectangle();
            Triangle t = new Triangle();
            System.out.println("Area of Rectangle is: " + r.area(5, 6));
            System.out.println("Area of Triangle is: " + t.area(5, 6));
      }
}
