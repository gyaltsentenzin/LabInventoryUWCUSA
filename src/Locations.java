 
public class Locations {
      private String Roomno;
      private String Drawername;
  
   
  
  public String GetRoomno(){
      return Roomno;
  }
  
  public void SetRoomno (String Roomno){
      this.Roomno=Roomno;
 }
  
  public String GetDrawername(){
      return Drawername;
  }
  
  public void SetDrawername (String Drawername){
      this.Drawername=Drawername;
 }
  
  
 public Locations(String Roomno, String Drawername){
     this.Roomno=Roomno;
     this.Drawername=Drawername;
 }
  
 
  
}
