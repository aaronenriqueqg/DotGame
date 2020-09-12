/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotgame;
import java.util.ArrayList;
/**
 *
 * @author aaron
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    
    
    String checkYourself(String userInput){
        
        String result = "miss";
      int index = locationCells.indexOf(userInput);
      if(index>=0){
          locationCells.remove(index);
      
            
        
        if(locationCells.isEmpty()){
            result ="kill";
        }
        else{
            result ="hit";
        }
        
      }
     return result;               
    }
    
    void setLocationCells(ArrayList<String> loc)
    {
        locationCells = loc;
        
    }
}
