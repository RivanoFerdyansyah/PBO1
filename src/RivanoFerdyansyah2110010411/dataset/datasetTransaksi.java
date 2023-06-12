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
public class datasetTransaksi {
    
    private ArrayList<String> id;
    private ArrayList<String> tgl;
    private ArrayList<String> kduser;
    private ArrayList<String> bayar;
    private ArrayList<String> kembali;
    
    
    public datasetTransaksi (){
    
        id = new ArrayList<>();
        tgl = new ArrayList<>();
        kduser = new ArrayList<>();
        bayar = new ArrayList<>();
        kembali = new ArrayList<>();
        
    }
    
    public void addNoFaktur(String value){
        id.add(value);
    }
    
    public ArrayList<String> getDataNoFaktur(){
        return this.id;
    }
    
    public void addTgl(String value){
        tgl.add(value);
    }
    
    public ArrayList<String> getDataTgl(){
        return this.tgl;
    }
    
    public void addKdUser(String value){
        kduser.add(value);
    }
    
    public ArrayList<String> getDataKdUser(){
        return this.kduser;
    }
    public void addBayar(String value){
        bayar.add(value);
    }
    
    public ArrayList<String> getDataBayar(){
        return this.bayar;
    }
    
    public void addKembalian(String value){
        kembali.add(value);
    }
    
    public ArrayList<String> getDataKembalian(){
        return this.kembali;
    }
    
    
}
