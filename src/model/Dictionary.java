/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Adam Hafidz F
 */
public class Dictionary {
    private ArrayList<Term> terms;
    
    public Dictionary(ArrayList<Term> terms)
    {
        this.terms=terms;
    }
    public Term Search(String term)
    {
        Term res=null;
        Iterator it=terms.iterator();
        Term temp;
        while(it.hasNext())
        {
            temp=(Term) it.next();
            if(temp.getIstilah().equalsIgnoreCase(term))
            {
                res=temp;
                break;
            } 
        }
        return res;
    }
    public void add(String term,ArrayList<String> definition)
    {
        Term temp=new Term(term, definition);
        terms.add(temp);
    }
    public void remove(Term t)
    {
        terms.remove(t);
    }
    public void edit(Term t, Term newT)
    {
        terms.remove(t);
        terms.add(newT);
    }
}
