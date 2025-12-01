public class Shape2D{
  public int length=5;
  public String shape = "";
  public double wide = 0;
  public double base = 0 ;
  public double height = 0;
  public double side1= 0;
  public double side2= 0;
  public double side3= 0;
  
  public Shape2D(){
    System.out.println("A Square has been created with length: "+this.length);
    this.shape="Square";
  }
  public void area (){
    double area =0.0;
    if(side1==0){
    if(this.shape.equals("Square")){
      area = length*length;
    }
    else if(this.shape.equals("Rectangle")){
      area = this.wide*this.length;
    }
    else if(this.shape.equals("Triangle")){
      area= 0.5*base*height;
    }
    System.out.println("The area of the "+this.shape+" is :"+area);
    }
    else{
      double s = (side1+side2+side3)/2.0;
      area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    System.out.printf("The area of the  "+this.shape+" is : %.2f\n", area);
    }
    
  }
  public Shape2D(int a, int b){
    this.shape= "Rectangle" ; 
    this.length=a;
    this.wide=b;
    System.out.println("A Rectangle has been created with length: "+a+" and breadth:  "+b);
  }
  public Shape2D(int a , int b , String shape){
    this.height = a;
    this.base = b ;
     this.shape= shape;
     System.out.println("A Triangle has been created with height: "+a+" and base:  "+b);
  }
  public Shape2D(int a , int b , int c){
    this.side1=a;
    this.side2=b;
    this.side3=c;
    this.shape= "Triangle";
    System.out.println("A Triangle has been created with the following sides: "+a+", "+b+", "+c);
  }
}