/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;

/**
 *
 * @author itrep
 */
public class Transaksi {
    
    private String id,tgl, kduser, bayar, kembali;
    
    public Transaksi (){}
    
    public void setNoFaktur(String id){
        this.id=id;
    }
    
    public String getNoFaktur(){
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
    public void setBayar(String bayar){
        this.bayar=bayar;
    }
    
    public String getBayar(){
        return this.bayar;
    }
    
    public void setKembali(String kembali){
        this.kembali=kembali;
    }
    
    public String getKembali(){
        return this.kembali;
    }
    
}
