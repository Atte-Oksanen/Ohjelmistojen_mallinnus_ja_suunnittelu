package Oksanen;
import java.util.*;
class Drawing {

  private List<ShapeBasic> basicShapes;

  public Drawing(){
    basicShapes = new ArrayList<ShapeBasic>();
  }

  public void addBasicShape(ShapeBasic shape){
    basicShapes.add(shape);
  }

  public List<ShapeBasic> getBasicShapes(){
    return basicShapes;
  }

  public void draw(){
    if (basicShapes.isEmpty()){
      System.out.println("There are no shapes to draw :(");
      return;
    }

    for(int n = 0; n < basicShapes.size(); n++){
      basicShapes.get(n).draw();
    }
  }

  public void grow(){
    if (basicShapes.isEmpty()){
      System.out.println("There are no shapes to grow :(");
      return;
    }
    for(int n = 0; n < basicShapes.size(); n++){
      basicShapes.get(n).grow();
    }
  }

  public void showVisibility(){

    if (basicShapes.isEmpty()){
      System.out.println("There are no shapes to show :(");
      return;
    }

    for(int n = 0; n < basicShapes.size(); n++){
      System.out.print(n + 1);
      System.out.print(".");

      if (basicShapes.get(n).isVisible() == true){
        System.out.println(" shape is visible: " + basicShapes.get(n).printText());
      }
      else{
        System.out.println(" shape is in the background: " + basicShapes.get(n).printText());
      }
    }

    }
  }
