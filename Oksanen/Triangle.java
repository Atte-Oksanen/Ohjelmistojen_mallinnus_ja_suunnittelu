package Oksanen;
import java.text.DecimalFormat;
import java.lang.Math;

class Triangle implements ShapeSpecial{

  private double a, b, c;
  private String color = "No color";
  static DecimalFormat df2;

  public Triangle(){

  }

  public Triangle(String color){
    setColor(color);
  }

  public Triangle(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public Triangle(double a, double b, double c, String color){
    this.a = a;
    this.b = b;
    this.c = c;
    setColor(color);
  }

  public boolean setColor(String color){
    if(color.equalsIgnoreCase("blue") || color.equalsIgnoreCase("red")){
      this.color = color;
      return true;
    }
    else {
      return false;
    }

  }

  public String getColor(){
    return (" Color: " + color);
  }

  public double calculateArea(){
    double p = (a + b + c) / 2;
    return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
  }

  public double calculatePerimeter(){
    return (a + b + c);
  }

  public void drawShape(){
    df2 = new DecimalFormat("#.##");
    System.out.println("Drawing a triangle with area: " + df2.format(calculateArea()) + " and perimeter: " + ((int)calculatePerimeter()) + getColor());
  }
}
