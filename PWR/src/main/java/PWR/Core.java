package PWR;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kieren
 */
public class Core {
    
    
    String teamName;
    int partNumber;

    public Core(String teamName, int partNumber) {
        this.teamName = teamName;
        this.partNumber = partNumber;
    }
    
    
    public String getTeamName (String teamName){
        return teamName;
        
    }
    public int getPartNumber (int partNumber){
        return partNumber;
        
    }
    
    public void setTeamName(){
        this.teamName = teamName;
        
    }
    
    public void setPartNumber(){
        this.partNumber = partNumber;
        
    }
    
    
    
    
    
}
