/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RivanoFerdyansyah2110010411;

/**
 *
 * @author itrep
 */
public class DetailJurnal {
    
    private String id,ket, kduser, debit, kredit;
    
    public DetailJurnal (){}
    
    public void setNoJurnal(String id){
        this.id=id;
    }
    
    public String getNoJurnal(){
        return this.id;
    }
    
    public void setKeterangan(String ket){
        this.ket=ket;
    }
    
    public String getKeterangan(){
        return this.ket;
    }
    
    public void setKdUser(String kduser){
        this.kduser=kduser;
    }
    
    public String getKdUser(){
        return this.kduser;
    }
    public void setDebit(String debit){
        this.debit=debit;
    }
    
    public String getDebit(){
        return this.debit;
    }
    public void setKredit(String kredit){
        this.kredit=kredit;
    }
    
    public String getKredit(){
        return this.kredit;
    }
    
}
