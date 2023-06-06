/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;
import java.util.ArrayList;

/**
 *
 * @author itrep
 */
public class User {
    
    private ArrayList<String> id;
    private ArrayList<String> user;
    private ArrayList<String> pass;
    private ArrayList<String> level;
    
    public User (){
        
        id = new ArrayList<>();
        user = new ArrayList<>();
        pass = new ArrayList<>();
        level = new ArrayList<>();
    
    }
    
    public void addKdUser(String value){
        id.add(value);
    }
    
    public ArrayList<String> getKdUser(){
        return this.id;
    }
    
    public void setUser(String value){
        user.add(value);
    }
    
    public ArrayList<String> getUser(){
        return this.user;
    }
    
    public void setPass(String value){
        pass.add(value);
    }
    
    public ArrayList<String> getPass(){
        return this.pass;
    }
    public void setLevel(String value){
        level.add(value);
    }
    
    public ArrayList<String> getLevel(){
        return this.level;
    }
    
}
