public class ass7task2 {
  public static void main(String args[]) {
    double area = circleArea(5);
    System.out.println(area);
    double volume = sphereVolume(5);
    System.out.println(volume);
    findSpace(10, "circle");
  }

  public static double circleArea(int a) {
    double area =3.1416 * a * a;
    return area;
  }

  public static double sphereVolume(double a) {
    double vol = (4.0 / 3.0) * 3.1416 * a * a * a;
    return vol;
  }

  public static void findSpace(int a, String b) {
    if (b.equals("circle")) {
      double area = circleArea(a); 
      System.out.println(area);
    } else if (b.equals("sphere")) { 
      double volume = sphereVolume((double)a); 
      System.out.println(volume);
    } else {
      System.out.println("invalid");
    }
  }
}
