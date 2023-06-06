/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;
import java.util.ArrayList;

/**
 *
 * @author itrep
 */
public class Produk {
    private ArrayList<String> id;
    private ArrayList<String> produk;
    private ArrayList<String> harga;
    private ArrayList<String> satuan;
    
    public Produk (){
    
        id = new ArrayList<>();
        produk = new ArrayList<>();
        harga = new ArrayList<>();
        satuan = new ArrayList<>();
        
    }
    
    public void addKdProduk(String value){
        id.add(value);
    }
    
    public ArrayList<String>getDataKdProduk(){
        return this.id;
    }
    
    public void addNamaProduk(String value){
        produk.add(value);
    }
    
    public ArrayList<String> getDataNamaProduk(){
        return this.produk;
    }
    
    public void addHarga(String value){
        harga.add(value);
    }
    
    public ArrayList<String> getHarga(){
        return this.harga;
    }
    public void addSatuan(String value){
        satuan.add(value);
    }
    
    public ArrayList<String> getSatuan(){
        return this.satuan;
    }
    
}
