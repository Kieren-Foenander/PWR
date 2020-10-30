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
public class Stacker {
    
    String name;
    String level;
    
    
    public Stacker (String name, String level){
         this.name = name;
        this.level = level;
        
        
    }
    
    public String getName(){
        return name;
        
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    
     
    
    
    
}
