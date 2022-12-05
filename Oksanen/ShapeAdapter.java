package Oksanen;
class ShapeAdapter extends Visibility implements ShapeBasic{


  private ShapeSpecial adapter;

  public ShapeAdapter(ShapeSpecial adapter){
      this.adapter = adapter;
    }

  public void draw(){
    adapter.drawShape();
  }

  public void grow(){
    System.out.println(printText() +", cannot grow");
  }

  public String printText(){
    if(adapter instanceof Triangle){
      return "Triangle";
    }
    else if(adapter instanceof ShapeDiamond){
      return "Diamond Shape";
    }
    else{
      return "Wrong kind of shape - not supported";
    }

  }
}
