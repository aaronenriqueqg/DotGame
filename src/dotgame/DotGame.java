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
public class DotGame {

    /**
     * @param args the command line arguments
     */
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses =0;
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       DotGame game = new DotGame();
       game.setUpGame();
       game.startPlaying();
        
        
        
       
    }
    private void setUpGame(){
        DotCom theDotCom1 = new DotCom();
        DotCom theDotCom2 = new DotCom();
        DotCom theDotCom3 = new DotCom();
        
        theDotCom1.setName("Pets.com");
        theDotCom2.setName("Go2.com");
        theDotCom3.setName("Panda.com");
        dotComList.add(theDotCom1);
        dotComList.add(theDotCom2);
        dotComList.add(theDotCom3);
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com,Go2.com and Panda.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        
        for(DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
            
        }
    }
    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        
        numOfGuesses++;
        String result="miss";
        for (DotCom dotComToTest : dotComList){
            result= dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finishGame(){
        System.out.println("All Dot Coms area  dead! Your stock is now worthless.");
        if(numOfGuesses <=18){
            System.out.println("It only took you "+ numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
            
        }else
            System.out.println("Took long enough." + numOfGuesses + " guesses.");
        System.out.println("Fish are dancing with your options.");
    }
}
