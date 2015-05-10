package Controller;

import java.util.ArrayList;
import java.util.List;
import model.AdminAccount;
import model.AdminAccountList;
import model.Dictionary;
import model.Term;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Devina Emily
 */
public class DictionaryController {

    Dictionary dict;
    AdminAccountList accountList;
    AdminAccount admin;
    //DictionaryMain main;
    
    public DictionaryController() {
        accountList = new AdminAccountList();
    }

    public boolean login(String id, String password) {
        
        AdminAccount x=accountList.search(id, password);
        if (x!=null) {
            admin=x;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean logout() {
        if (admin==null) {
            return false;
        } else {
            admin=null;
            return true;
        }
    }
    
    public boolean add(String term, ArrayList<String> definition) {
        if(dict.search(term)==null)
        {
            dict.add(term,definition);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean edit(String termName, String newTermName, ArrayList<String> newDefinition) {
        if(dict.search(termName)!=null)
        {
            dict.edit(termName, newTermName, newDefinition);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean remove(String term) {
        if(dict.search(term)!=null)
        {
            dict.remove(term);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public List<String> search(String term)
    {
        Term term1=dict.search(term);
        return term1.getDefinitions();
    }
}
