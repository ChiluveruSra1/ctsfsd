package comm.example;

import static java.lang.System.out;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
public class Elevator {
  
  private static final int MAX_FLR=10;
  private static final int MIN_FLR=1;
  
  public boolean doorOpen;
  
  private int curntFlr;
  public int flr;
  
  {
	  doorOpen=false;
  }
 
  public void mveUpto(int flr){
    if((doorOpen) || (flr>MAX_FLR) ||(flr<curntFlr)){
      out.println("Check the door & floor number");
      //doorOpen=false;
    out.println("Clsing the door; ur in "+curntFlr+"  ;  can't go to "+flr);
    }
    else{  
    curntFlr=flr;
      out.println("Now, UR in "+curntFlr);
    }
    
        
  }
  public void mveDwnto(int flr){
    if((doorOpen) || (flr<MIN_FLR) || (flr>curntFlr)){
      out.println("Check the door & floor number");
      //doorOpen=false;
      out.println("Clsing the door; ur in "+curntFlr+"  ;  can't go to "+flr);
    }
    else{
    curntFlr=flr;
      out.println("Now, UR in "+curntFlr);
    }
        
  }
  
    
 
   
}
