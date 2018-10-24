class chick implements Animal{
  private String myType;
  private String mySound1;
  private String mySound2;
  public chick(String type, String sound1, String sound2){
    myType = type;
    mySound1 = sound1;
    mySound2 = sound2;
  }
  public String getSound(){
    int test = (int)(Math.random()*2);
    if(test == 0){
      return mySound1;
    }else{
      return mySound2;
    }
  }
  public String getType(){
    return myType;
  }
}
