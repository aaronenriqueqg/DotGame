/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotgame;

/**
 *
 * @author aaron
 */
public class ClassDotCom {
    int[] locationCells;
    int numOfHits=0;
    
    
    String checkYourself(String stringGuess){
        int guess= Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell : locationCells){
            if(guess == cell){
                result="hit";
                numOfHits++;
                break;
            }
            
            
        }
        if(numOfHits == locationCells.length){
            result ="kill";
        }
        
        System.out.println(result);
        return result;               
    }
    
    void setLocationCells(int[] loc)
    {
        locationCells = loc;
        
    }
}
