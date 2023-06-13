/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411.dataset;
<<<<<<< HEAD
=======

>>>>>>> 3a907d80fb7e5c848a47dbc4200f2de2376bd3dc
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class datasetJurnal {
    
    private ArrayList<String> id;
    private ArrayList<String> tgl;
    private ArrayList<String> iduser;
    
    public datasetJurnal (){
        
        id = new ArrayList<>();
        tgl = new ArrayList<>();
        iduser = new ArrayList<>();
    }
    
    public void addNoJurnal(String value){
<<<<<<< HEAD
        this.id.add(value);
=======
        this.id=id;
>>>>>>> 3a907d80fb7e5c848a47dbc4200f2de2376bd3dc
    }
    
    public ArrayList<String> getNoJurnal(){
        return this.id;
    }
    
    public void addTgl(String value){
<<<<<<< HEAD
        this.tgl.add(value);
=======
        this.tgl=tgl;
>>>>>>> 3a907d80fb7e5c848a47dbc4200f2de2376bd3dc
    }
    
    public ArrayList<String> getTgl(){
        return this.tgl;
    }
    
    public void addKdUser(String value){
<<<<<<< HEAD
        this.iduser.add(value);
=======
        iduser.add(value);
>>>>>>> 3a907d80fb7e5c848a47dbc4200f2de2376bd3dc
    }
    
    public ArrayList<String> getKdUser(){
        return this.iduser;
    }
    
}
