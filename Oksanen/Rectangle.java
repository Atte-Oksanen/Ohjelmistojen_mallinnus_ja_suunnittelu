package Oksanen;
class Rectangle extends Visibility implements ShapeBasic{

  public void draw(){
    System.out.println("Drawing a rectangle");
  }

  public void grow(){
    System.out.println("Growing the size of the rectangle");
  }

  public String printText(){
    return "Rectangle";
  }
}
