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
    String flatDifficulty;
    String helixDifficulty;
    
    
    
    public Stacker (String name, String flatDifficulty, String helixDifficulty){
        this.name = name;
        this.flatDifficulty = flatDifficulty;
        this.helixDifficulty = helixDifficulty;
        
        
        
        
    }
    
    public String getName(){
        return name;
        
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getFlatDifficulty() {
        return flatDifficulty;
    }

    public void setFlatDifficulty(String flatDifficulty) {
        this.flatDifficulty = flatDifficulty;
    }
    
    public String getHelixDifficulty(){
        return helixDifficulty;
        
    }
    
    public void setHelixDifficulty(String helixDifficulty){
        this.helixDifficulty = helixDifficulty;
        
    }
    
    @Override
    public String toString(){
        return name + "is able to complete flat panels of difficulty " + flatDifficulty 
                + "and is able to complete helix cores of difficulty " + helixDifficulty;
        
    }
    
     
    
    
    
}
