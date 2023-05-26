/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;

/**
 *
 * @author itrep
 */
public class User extends Jurnal{
    
    private String id,user, pass, level;
    
    public User (){}
    
    public void setKdUser(String id){
        this.id=id;
    }
    
    public String getKdUser(){
        return this.id;
    }
    
    public void setUser(String user){
        this.user=user;
    }
    
    public String getUser(){
        return this.user;
    }
    
    public void setPass(String pass){
        this.pass=pass;
    }
    
    public String getPass(){
        return this.pass;
    }
    public void setLevel(String level){
        this.level=level;
    }
    
    public String getLevel(){
        return this.level;
    }
    
}
