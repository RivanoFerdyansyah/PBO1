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
public class DetailJurnal {
    
    private ArrayList<String> id;
    private ArrayList<String> ket;
    private ArrayList<String> kduser;
    private ArrayList<String> debit;
    private ArrayList<String> kredit;
    
    
    public DetailJurnal (){
        id = new ArrayList<>();
        ket = new ArrayList<>();
        kduser = new ArrayList<>();
        debit = new ArrayList<>();
        kredit = new ArrayList<>();
    }
    
    public void addNoJurnal(String value){
        id.add(value);
    }
    
    public ArrayList<String> getNoJurnal(){
        return this.id;
    }
    
    public void addKeterangan(String value){
        ket.add(value);
    }
    
    public ArrayList<String> getKeterangan(){
        return this.ket;
    }
    
    public void addKdUser(String value){
        kduser.add(value);
    }
    
    public ArrayList<String> getKdUser(){
        return this.kduser;
    }
    public void addDebit(String value){
        debit.add(value);
    }
    
    public ArrayList<String> getDebit(){
        return this.debit;
    }
    public void addKredit(String value){
        kredit.add(value);
    }
    
    public ArrayList<String> getKredit(){
        return this.kredit;
    }
    
}
