package Oksanen;
abstract class Visibility{

  private boolean inBackground = false;

  public void changeVisibility(){
    if(inBackground == false){
      inBackground = true;
    }
    else{
      inBackground = false;
    }
  }

  public boolean isVisible(){
    if(inBackground == false){
      return true;
    }
    else{
      return false;
    }
  }

}
