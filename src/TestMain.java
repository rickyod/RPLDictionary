
import model.AdminAccount;
import model.AdminAccountList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devi
 */
public class TestMain {
    public static void main(String[] args) {
        AdminAccountList list = new AdminAccountList();
        
        AdminAccount x = list.search("Riky", "Setiawan");
        System.out.println(x.getID() + " " + x.getPassword());
        
        x = list.search("Riky", "setiawan");
        if(x!=null) {
            System.out.println(x.getID() + " " + x.getPassword());
        }
        
        x = list.search("gayod", "Jelek");
        if(x!=null) {
            System.out.println(x.getID() + " " + x.getPassword());
        }
        
        x = list.search("Hahaha", "Hehehehe");
        if(x!=null) {
            System.out.println(x.getID() + " " + x.getPassword());
        }
        
    }
}