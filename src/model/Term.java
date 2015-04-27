/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Devi
 */
public class Term {
    
    private String termName;
    private List<String> definitions;

    public Term(String istilah, String penjelasan) {
        this.termName = istilah;
        this.definitions = new ArrayList<>();
        this.definitions.add(penjelasan);
    }
    
    public String getIstilah() {
        return termName;
    }

    public void setIstilah(String istilah) {
        this.termName = istilah;
    }

    public List<String> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<String> definitions) {
        this.definitions = definitions;
    }
    
}
