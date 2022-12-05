package Oksanen;
class Circle extends Visibility implements ShapeBasic{

  public void draw(){
    System.out.println("Drawing a circle");
  }

  public void grow(){
    System.out.println("Growing the size of the circle");
  }

  public String printText(){
    return "Circle";
  }
}
