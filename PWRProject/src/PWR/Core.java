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
public abstract class Core {
    
    
    String teamName;
    int partNumber;
    int serial;

    public Core(String teamName, int partNumber, int serial) {
        this.teamName = teamName;
        this.partNumber = partNumber;
        this.serial = serial;
    }
    
    
    public String getTeamName (String teamName){
        return teamName;
        
    }
    public int getPartNumber (int partNumber){
        return partNumber;
        
    }
    
    public void setTeamName(String teamName){
        this.teamName = teamName;
        
    }
    
    public void setPartNumber(int partNumber){
        this.partNumber = partNumber;
        
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }
    
    public abstract String getDifficulty();
    


    
    
    
    
    
    
    
    
    
}
