package Oksanen;
class AdapterMain{

  public AdapterMain(){
    
  }

  public static void main(String[] args) {

    Drawing sketch = new Drawing();
    ShapeBasic rect2 = new Rectangle();
    ShapeBasic tri2 = new ShapeAdapter(new Triangle(1,1,1,"Blue"));
    ShapeBasic dia2 = new ShapeAdapter(new ShapeDiamond(1,1,"Red"));
    ShapeBasic stroke = new BrushStroke();

    sketch.addBasicShape(new Rectangle());
    ((Rectangle)rect2).changeVisibility();
    sketch.addBasicShape(rect2);
    sketch.addBasicShape(new Circle());
    sketch.addBasicShape(new ShapeAdapter(new Triangle(1,1,1,"Red")));
    sketch.addBasicShape(new ShapeAdapter(new ShapeDiamond(1,1,"Blue")));
    ((ShapeAdapter)dia2).changeVisibility();
    sketch.addBasicShape(dia2);
    ((ShapeAdapter)tri2).changeVisibility();
    sketch.addBasicShape(tri2);
    ((BrushStroke)stroke).changeVisibility();
    sketch.addBasicShape(stroke);
    sketch.addBasicShape(new BrushStroke());


    sketch.draw();
    System.out.println();
    sketch.grow();
    System.out.println();
    sketch.showVisibility();
  }
}
