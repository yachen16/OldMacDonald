class cow implements Animal{
  protected String myType;
  protected String mySound;
  public cow(String type, String sound){
    myType = type;
    mySound = sound;
  }
  public cow(){
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound(){
    return mySound;
  }
  public String getType(){
    return myType;
  }
}
