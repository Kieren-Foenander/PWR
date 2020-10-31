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
    
    
    public FlatPanel(String teamName, int partNumber, int serial, String difficulty){
        super(teamName, partNumber, serial);
        this.difficulty = difficulty;
        
    }
    
    public String getDificulty(){
        return difficulty;
        
    }
    
    public void setDifficulty(String difficulty){
        this.difficulty = difficulty;
        
    }
    
    
    
    
    
    
}
