public class Circle extends Shape {
  public double radius;

  public void area() {
    double area = Math.PI * radius * radius;
    System.out.printf("Area of "+color+" "+name+": %.2f\n", area);
  }
}
