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
public class Akun {
    
    private ArrayList<String> id;
    private ArrayList<String> akun;
    
    public Akun (){
    
        id = new ArrayList<>();
        akun = new ArrayList<>();
        
    }
    
    
    public void addKdAkun(String value){
        id.add(value);
    }
    public ArrayList<String> getKdAkun(){
        return this.id;
    }
    
    public void addNamaAkun(String value){
        akun.add(value);
    }
    public ArrayList<String> getNamaAkun(){
        return this.akun;
    }
    
    public void TambahAkun(String id, String akun){
        
      addKdAkun(id);
      addNamaAkun(akun);
              
    }
    
}
