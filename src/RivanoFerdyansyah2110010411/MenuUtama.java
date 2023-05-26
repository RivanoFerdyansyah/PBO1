/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RivanoFerdyansyah2110010411;

/**
 *
 * @author itrep
 */
public class MenuUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        User obj = new User();
        obj.setKdUser("411");
        obj.setUser("Rivano");
        obj.setPass("12345");
        obj.setLevel("Admin");
        System.out.println("\n ID User : "+obj.getKdUser() +
                "\n User : "+obj.getUser() +
                "\n Password : "+obj.getPass() + 
                "\n Level : " +obj.getLevel());
        obj.setNoJurnal("1");
        obj.setTgl("23/05/2023");
        System.out.println("\n No Jurnal : "+ obj.getNoJurnal()+
                "\n Tanggal : "+obj.getTgl());
        
        
      
    }
    
    
    
}
