/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;

/**
 *
 * @author itrep
 */
public class Jurnal{
    
    private String id,tgl, kduser;
    
    public Jurnal (){}
    
    public void setNoJurnal(String id){
        this.id=id;
    }
    
    public String getNoJurnal(){
        return this.id;
    }
    
    public void setTgl(String tgl){
        this.tgl=tgl;
    }
    
    public String getTgl(){
        return this.tgl;
    }
    
    public void setKdUser(String kduser){
        this.kduser=kduser;
    }
    
    public String getKdUser(){
        return this.kduser;
    }
    
}
