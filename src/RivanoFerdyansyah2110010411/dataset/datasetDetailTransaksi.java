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
public class datasetDetailTransaksi {
    
    private ArrayList<String> id;
    private ArrayList<String> idproduk;
    private ArrayList<String> jml;
    private ArrayList<String> total;
    
    public datasetDetailTransaksi (){
        id = new ArrayList<>();
        idproduk = new ArrayList<>();
        jml = new ArrayList<>();
        total = new ArrayList<>();
    }
    
    public void addNofaktur(String value){
        id.add(value);
    }
    
    public ArrayList<String> getNoFaktur(){
        return this.id;
    }
    
    public void addKdProduk(String value){
        idproduk.add(value);
    }
    
    public ArrayList<String> getProduk(){
        return this.idproduk;
    }
    
    public void addJumlah(String value){
        jml.add(value);
    }
    
    public ArrayList<String> getJumlah(){
        return this.jml;
    }
    public void addTotal(String value){
        total.add(value);
    }
    
    public ArrayList<String> getTotal(){
        return this.total;
    }
    
}
