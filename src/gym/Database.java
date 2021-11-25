/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

/**
 *
 * 
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    public static HashMap<String, String> TrainerUserNameToPasswordHashmap;
    public static HashMap<String, String> UserNameToPasswordHashmap;
    public static ArrayList<Info> UserList;
    public static ArrayList<Info> TrainerList;
    public static ArrayList<EquipmentInfo> EquipmentList;
    public static int IDX=0;
    public static ArrayList<EquipmentInfo> ExercisePlanList;
    public static int ID = 0,TID = 0,EID=0;
    
    public Database(){
        TrainerUserNameToPasswordHashmap = new HashMap<>();
        UserNameToPasswordHashmap = new HashMap<>();
        TrainerList = new ArrayList<>();
        UserList = new ArrayList<>();
        EquipmentList = new ArrayList<>();
        ExercisePlanList = new ArrayList<>();
    }

}