/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

/**
 *
 * @author Harshit
 */
public class EquipmentInfo {
    String ID;
    String EquipmentName;
    String GymHall;
    String TrainerName;
    String ExercisePlan;
    String Duration;
    String EquipmentName2;
    
    
    public EquipmentInfo(){}

    public EquipmentInfo(String ID, String EquipmentName, String GymHall) {
        this.ID = ID;
        this.EquipmentName = EquipmentName;
        this.GymHall = GymHall;
    }

    public EquipmentInfo(String EquipmentName, String GymHall, String TrainerName, String ExercisePlan, String Duration, String EquipmentName2) {
        this.EquipmentName = EquipmentName;
        this.GymHall = GymHall;
        this.TrainerName = TrainerName;
        this.ExercisePlan = ExercisePlan;
        this.Duration = Duration;
        this.EquipmentName2 = EquipmentName2;
    }

    public String getTrainerName() {
        return TrainerName;
    }

    public void setTrainerName(String TrainerName) {
        this.TrainerName = TrainerName;
    }

    public String getExercisePlan() {
        return ExercisePlan;
    }

    public void setExercisePlan(String ExercisePlan) {
        this.ExercisePlan = ExercisePlan;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getEquipmentName2() {
        return EquipmentName2;
    }

    public void setEquipmentName2(String EquipmentName2) {
        this.EquipmentName2 = EquipmentName2;
    }
    
    

    public String getID() {return ID;}
    public void setID(String ID) {this.ID = ID;}
    
    public String getEquipmentName() {return EquipmentName;}
    public void setEquipmentName(String EquipmentName) {this.EquipmentName = EquipmentName;}
    
    public String getGymHall() {return GymHall;}
    public void setGymHall(String GymHall) {this.GymHall = GymHall;}
    
}
