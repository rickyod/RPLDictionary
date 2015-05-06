/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Adam Hafidz F
 */
public class Dictionary {
    private HashMap<String , Term> termsMap;
    
    public Dictionary(HashMap<String , Term> termsMap)
    {
        this.termsMap=termsMap;
    }
    
    public Term search(String term)
    {
        return termsMap.get(term);
    }
    public void add(String term,ArrayList<String> definition)
    {
        Term temp=new Term(term, definition);
        termsMap.put(term, temp);
    }
    public void remove(String t)
    {
        termsMap.remove(t);
    }
    public boolean edit(String termName, String newTermName , ArrayList<String> newDefinition)
    {
        Term oldTerm = search(termName);
        if(oldTerm==null){
            return false;
        }
        termsMap.remove(termName);
        termsMap.put(termName, new Term(newTermName,newDefinition));
        return true;
    }
}
