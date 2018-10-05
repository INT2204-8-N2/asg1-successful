/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package successful;

/**
 *
 * @author dell
 */
public class Successful {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DictionaryManagement x = new DictionaryManagement();
        x.insertFromCommandline();
        DictionaryCommandline y = new DictionaryCommandline();
        y.showAllWord();
    }
    
}
