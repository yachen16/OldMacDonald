class NamedCow extends cow{
  private String myName;
  public NamedCow(String type, String sound, String name){
    myType = type;
    mySound = sound;
    myName = name;
  }
  public String getName(){
    return myName;
  }
}
