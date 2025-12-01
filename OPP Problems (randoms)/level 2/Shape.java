public class Shape{
  public String type ="";
  public double area;
  public void setParameters(String shape, double para){
    if(shape.equals("Circle")){
      this.area=3.1416*para*para;
      this.type="Circle";
    }
  }
  public void setParameters(String shape, double num1 , double num2){
    if(shape.equals("Triangle")){
      this.area=0.5*num1*num2;
      this.type="Triangle";
    }
    else if(shape.equals("Rectangle")){
      this.area=num1*num2;
      this.type="Rectangle";
    }
  }
  public String details(){
    this.area=Math.round(this.area * 100) / 100.0;
    String s="";
    if(this.type.equals("Circle")){
      s="Shape Name: "+this.type+"\nArea: "+this.area;
    }
    else if(this.type.equals("Triangle")){
      s="Shape Name: "+this.type+"\nArea: "+this.area;
    }
    else if(this.type.equals("Rectangle")){
      s="Shape Name: "+this.type+"\nArea: "+this.area;
    }
    
    return s;
  }
}
    
  