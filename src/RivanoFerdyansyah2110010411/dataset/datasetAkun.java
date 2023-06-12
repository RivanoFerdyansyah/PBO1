/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411.dataset;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class datasetAkun {
    private ArrayList<String> id;
    private ArrayList<String> akun;
    
    public datasetAkun (){
    
        id = new ArrayList<>();
        akun = new ArrayList<>();
        
    }
    
    
    public void addKdAkun(String value){
        id.add(value);
    }
    public ArrayList<String> getDataKdAkun(){
        return this.id;
    }
    
    public void addNamaAkun(String value){
        akun.add(value);
    }
    public ArrayList<String> getDataNamaAkun(){
        return this.akun;
    }
    
    public void TambahAkun(String id, String akun){
        
      addKdAkun(id);
      addNamaAkun(akun);
              
    }
    
}
