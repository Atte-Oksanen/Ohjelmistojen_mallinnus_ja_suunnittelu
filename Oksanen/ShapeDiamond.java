package Oksanen;
import java.text.DecimalFormat;

class ShapeDiamond implements ShapeSpecial{

  private double a, b;
  static DecimalFormat df2;
  private String color = "No color";

  public ShapeDiamond(){

  }

  public ShapeDiamond(String color){
    setColor(color);
  }

  public ShapeDiamond(double a, double b){
    this.a = a;
    this.b = b;
  }

  public ShapeDiamond(double a, double b, String color){
    this.a = a;
    this.b = b;
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
    return (a*b);
  }

  public double calculatePerimeter(){
    return (a*2 + b*2);
  }

  public void drawShape(){
    df2 = new DecimalFormat("#.##");
    System.out.println("Drawing a diamond shape with area: " + df2.format(calculateArea()) + " and perimeter: " + df2.format(calculatePerimeter()) + getColor());
  }
}
