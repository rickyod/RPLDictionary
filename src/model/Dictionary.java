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
    
    public Term Search(String term)
    {
        return termsMap.get(term);
    }
    public void add(String term,ArrayList<String> definition)
    {
        Term temp=new Term(term, definition);
        termsMap.put(term, temp);
    }
    public void remove(Term t)
    {
        termsMap.remove(t);
    }
    public void edit(Term t, Term newT)
    {
        termsMap.remove(t);
        termsMap.put(newT.getIstilah(), newT);
    }
}
