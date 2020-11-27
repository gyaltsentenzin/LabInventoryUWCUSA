
public class Equipments {
   
    private String Equipname;
    private float Quantity;
    private String Unit;
    private String Subject;
    private User U;
    private Locations Loc;
    
   public String setEquipname(){
      return Equipname;
  }
  
  public void setEquipname (String Equipname){
      this.Equipname=Equipname;
 }
  
 public float getQuantity(){
      return Quantity;
  }
  
  public void setQuantity (float Quantity){
      this.Quantity=Quantity;
 }
 
  public String getUnit(){
      return Unit;
  }
  
  public void setUnit (String Unit){
      this.Unit=Unit;
 }
  
   public String getSubject(){
      return Subject;
  }
  
  public void setSubject (String Subject){
      this.Subject=Subject;
 }

  
  
  public void setRoomloc(String Room){
      Loc.SetRoomno(Room);
  }
  
  public String getRoomloc(){
      return Loc.GetRoomno();
  }
  
  public void setDrawername(String Drawer){
      Loc.SetDrawername(Drawer);
  }
  
  public String getDrawername(){
      return Loc.GetDrawername();
  }
  
  
  public void setUsername(String Usern){
      U.setUsername(Usern);
  }
   
  public String getUsername(){
      return U.getUsername();
  }
  
}
