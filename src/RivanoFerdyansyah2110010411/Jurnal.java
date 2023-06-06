/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Jurnal {
    
    private ArrayList<String> id;
    private ArrayList<String> tgl;
    private ArrayList<String> iduser;
    
    public Jurnal (){
        
        id = new ArrayList<>();
        tgl = new ArrayList<>();
        iduser = new ArrayList<>();
    }
    
    public void addNoJurnal(String value){
        this.id=id;
    }
    
    public ArrayList<String> getNoJurnal(){
        return this.id;
    }
    
    public void addTgl(String value){
        this.tgl=tgl;
    }
    
    public ArrayList<String> getTgl(){
        return this.tgl;
    }
    
    public void addKdUser(String value){
        iduser.add(value);
    }
    
    public ArrayList<String> getKdUser(){
        return this.iduser;
    }
    
}
