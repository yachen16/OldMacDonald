class pig implements Animal{
  private String myType;
  private String mySound;
  public pig(String type, String sound){
    myType = type;
    mySound = sound;
  }
  public String getSound(){
    return mySound;
  }
  public String getType(){
    return myType;
  }
}
