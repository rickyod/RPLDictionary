/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Devi
 */
public class DictionaryFileReader {
    
    public List loadTerm(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            
            List<Term> list = new ArrayList<>();
            
            Term curTerm;
            String termName, definition;
            ArrayList<String> definitions;

            while (true) {
                try {
                    termName = br.readLine();
                    if(termName==null) { break; }
                    definition = br.readLine();
                    curTerm = new Term(termName,definition);
                    
                    //READ OTHER DEFINITIONS
                    //BELUM BERES
                    //FORMATNYA GIMANA?
                    //AAAA BBBB CCCC
                    
                    list.add(curTerm);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
            return list;
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }    
    
    public List loadAdminAccountList(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            
            List<AdminAccount> list = new ArrayList<>();
            String ID, password;

            while (true) {
                try {
                    ID = br.readLine();
                    if(ID==null) { break; }
                    password = br.readLine(); br.readLine();
                    list.add(new AdminAccount(ID, password));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
            return list;
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        return null;
    }
    
}

/*
Format admin:
NamaID
Password

NamaID
Password

NamaID
Password
*/