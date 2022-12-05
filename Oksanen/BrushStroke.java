package Oksanen;
class BrushStroke extends Visibility implements ShapeBasic{

  public void draw(){
    System.out.println("Drawing a brush stroke");
  }

  public void grow(){
    System.out.println("Adding some color...");

  }

  public String printText(){
    return "Brush Stroke";

  }
}
