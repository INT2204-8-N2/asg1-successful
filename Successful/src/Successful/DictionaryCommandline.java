/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Successful;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class DictionaryCommandline {
    void showAllWord() {
		Dictionary dic = new Dictionary();
		System.out.println("| Anh" + "    " + "| Viet");
		for( int i = 0; i < dic.word.size(); i++)
		System.out.println("| " + dic.word.get(i).GetWord_target() + " |" + dic.word.get(i).GetWord_explain());
	}
     void dictionaryBasic(){
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromCommandline();
        showAllWord();
	}
	void dictionaryAdvanced(){
        
        DictionaryManagement dm = new DictionaryManagement();
        dm.insertFromFile();
        showAllWord();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập từ cần tra: ");
        String find_word = input.nextLine();
        System.out.println(dm.dictionaryLookup(find_word));
    }
}
	
