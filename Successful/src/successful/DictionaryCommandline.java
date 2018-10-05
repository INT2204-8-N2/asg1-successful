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
public class DictionaryCommandline {
    void showAllWord() {
		Dictionary a = new Dictionary();
		System.out.println("| Anh" + "    " + "| Viet");
		for( int i = 0; i < a.word.size(); i++)
		System.out.println("| " + a.word.get(i).GetWord_target() + " |" + a.word.get(i).GetWord_explain());
	}
}
