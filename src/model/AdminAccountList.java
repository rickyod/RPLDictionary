/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Devi
 */
public class AdminAccountList {
    private Map<String, String> adminAccounts;
    
    public AdminAccountList() {
        this.adminAccounts = new HashMap<>();
        DictionaryFileReader reader = new DictionaryFileReader();
        List<AdminAccount> list = reader.loadAdminAccountList("adminlist.txt");
        
        for (AdminAccount aa : list) {
            adminAccounts.put(aa.getID(), aa.getPassword());
        }
    }
    
    public AdminAccount search(String ID, String password) {
        String actualPassword = adminAccounts.get(ID);
        if(actualPassword!=null && password.equals(actualPassword)) {
            return new AdminAccount(ID, actualPassword);
        } else {
            return null;
        }
    }
}
