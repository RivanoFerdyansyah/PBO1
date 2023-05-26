/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;

/**
 *
 * @author itrep
 */
public class DetailTransaksi {
    
    private String nofaktur,kdproduk, jml, total;
    
    public DetailTransaksi (){}
    
    public void setNofaktur(String nofaktur){
        this.nofaktur=nofaktur;
    }
    
    public String getNoFaktur(){
        return this.nofaktur;
    }
    
    public void setKdProduk(String kdproduk){
        this.kdproduk=kdproduk;
    }
    
    public String getProduk(){
        return this.kdproduk;
    }
    
    public void setJml(String jml){
        this.jml=jml;
    }
    
    public String getJml(){
        return this.jml;
    }
    public void setTotal(String total){
        this.total=total;
    }
    
    public String getTotal(){
        return this.total;
    }
    
}
