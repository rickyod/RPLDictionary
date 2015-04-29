/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Devi
 */
public class DictionaryFileWriter {

    public void writeTermsToFile(List<Term> terms, String fileName) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fileName)));
            List<String> definitions;
            
            for (Term t : terms) {
                bw.write(t.getIstilah()+"\n");
                
                definitions = t.getDefinitions();
                for (String s : definitions) {
                    bw.write("-\n");
                    bw.write(s+"\n");
                }
                bw.write("*\n");
            }
            bw.write("*****");
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
