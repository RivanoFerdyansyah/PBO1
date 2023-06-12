/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411.dataset;

import java.util.ArrayList;

/**
 *
 * @author itrep
 */
public class datasetProduk {
    
    private ArrayList<String> id;
    private ArrayList<String> produk;
    private ArrayList<String> harga;
    private ArrayList<String> satuan;
    
    public datasetProduk(){
        
        id= new ArrayList<>();
        produk= new ArrayList<>();
        harga= new ArrayList<>();
        satuan= new ArrayList<>();
        
    }
    
    public void addKdProduk(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getKdProduk(){
        return this.id;
    }
    
    public void addNamaProduk(String value){
        this.produk.add(value);
    }
    
    public ArrayList<String> getNamaProduk(){
        return this.produk;
    }
    
    public void addHarga(String value){
        this.harga.add(value);
    }
    
    public ArrayList<String> getHarga(){
        return this.harga;
    }
    public void addSatuan(String value){
        this.satuan.add(value);
    }
    
    public ArrayList<String> getSatuan(){
        return this.satuan;
    }
    
}
