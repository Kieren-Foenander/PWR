/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PWR;

/**
 *
 * @author Kieren
 */
public class FlatPanel extends Core {
    
    String difficulty;
    
    
    public FlatPanel(String teamName, int partNumber, int serial, int dateDay, int dateMonth, int dateYear, String difficulty){
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
