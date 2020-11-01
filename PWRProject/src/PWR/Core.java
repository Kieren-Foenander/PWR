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
    int dateDay;
    int dateMonth;
    int dateYear;
    
    

    public Core(String teamName, int partNumber, int serial, int dateDay, int dateMonth, int dateYear) {
        this.teamName = teamName;
        this.partNumber = partNumber;
        this.serial = serial;
        this.dateDay = dateDay;
        this.dateMonth = dateMonth;
        this.dateYear = dateYear;
        
    }
    
    public boolean eqauals (Core other){
        return this.getDateDay() == other.getDateDay();
    }
    
    public int compareTo (Core other){
        if (this.eqauals(other)){
            return 0;
            
        }else if (getDateDay() > other.getDateDay()){
            return 1;
            
        }else {
            return -1;
            
        }
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
    
    

    public int getDateDay() {
        return dateDay;
    }

    public void setDateDay(int dateDay) {
        this.dateDay = dateDay;
    }

    public int getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(int dateMonth) {
        this.dateMonth = dateMonth;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }
    
    public abstract String getDifficulty(); // abstract method to get difficulty for both helix and flat panels 
    
    @Override
    public String toString(){
        return teamName + " " + partNumber + " " + serial + "due date " + dateDay + "/" + dateMonth + "/" + dateYear;
        
    }


    
    
    
    
    
    
    
    
    
}
