/*
 * /*
Programmer: Kieren Foenander S012141776
Course: Object Oriented Programming COIT11134
Assignment 1
 */

package PWR;

/**
 *
 * @author black
 */
public class Helix extends Core{
    
    String difficulty;
    
    public Helix (String teamName, int partNumber,int serial, int dateDay, int dateMonth, int dateYear, String difficulty){
        super(teamName, partNumber, serial, dateDay, dateMonth, dateYear);
        this.difficulty = difficulty;
        
        
    }
    
    @Override
    public String getDifficulty(){
        return difficulty;
        
    }
    
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
        
    }
    
    

}
