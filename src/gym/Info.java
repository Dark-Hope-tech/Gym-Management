/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.util.HashMap;

/**
 *
 * @author Harshit
 */
public class Info {
    String ID;
    String Name;
    String Gender;
    String Phone;
    String Address;
    String Password;
    String GymHall;
    String exercisesub;

    HashMap<String, Integer> TrainerToTime = new HashMap<>();
    int sum;
    //int t1,t2,t3,t4,t5,t6;
    //public static ArrayList<Integer> TrainerTime;
    
    public Info(){}
    public Info(String ID, String Name, String Gender, String password, String Phone, String Address){
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Password = password;
        this.Phone = Phone;
        this.Address = Address;
        this.exercisesub="";
    }
    
    public Info(String ID, String Name, String Gender, String password, String Phone, String Address, String GymHall){
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.Password = password;
        this.Phone = Phone;
        this.Address = Address;
        this.GymHall = GymHall;
        this.TrainerToTime.put("8-10",0);
        this.TrainerToTime.put("10-12",0);
        this.TrainerToTime.put("12-14",0);
        this.TrainerToTime.put("14-16",0);
        this.TrainerToTime.put("16-18",0);
        this.TrainerToTime.put("18-20",0);
        this.sum=0;
    }

    public void setID(String id){this.ID = id;}
    public void setName(String name){this.Name = name;}
    public void setGender(String Gender) {this.Gender = Gender;}
    public void setPhone(String phone){this.Phone = phone;}
    public void setAddress(String address){this.Address = address;}
    public void setPassword(String password){this.Password = password;}
    public void setGymHall(String GymHall) {this.GymHall = GymHall;}

    public String getID(){return this.ID;}
    public String getName(){return this.Name;}
    public String getGender() {return Gender;}
    public String getPhone(){return this.Phone;}
    public String getAddress(){return this.Address;}
    public String getGymHall() {return GymHall;}
}
