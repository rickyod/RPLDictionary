
import model.AdminAccount;
import model.AdminAccountList;
import model.DictionaryFileReader;
import model.DictionaryFileWriter;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devi
 */
public class DebugTester {
    public static void main(String[] args) {
        AdminAccountList list = new AdminAccountList();
        
        AdminAccount x = list.search("Riky", "Setiawan");
        System.out.println(x.getID() + " " + x.getPassword());
        
        x = list.search("Day", "Cantik");
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
        
        DictionaryFileReader dfr = new DictionaryFileReader();
        DictionaryFileWriter dfw = new DictionaryFileWriter();
        dfw.writeTermsToFile(dfr.loadTerm("terms.txt"),"termsCobaTulis.txt");
        
    }
}
