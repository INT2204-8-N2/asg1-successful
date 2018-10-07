/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Successful;

/**
 *
 * @author dell
 */
public class Word {
        public String word_target;
	public String word_explain;
	public Word(String word_target, String word_explain){
		this.word_explain = word_explain;
		this.word_target = word_target;
	}
        public Word(){
            
        }
	public void SetWord_target(String word_target) {
		this.word_target = word_target;
	}
	public String GetWord_target() {
		return this.word_target;				
	}
	public void SetWord_explain(String word_explain) {
		this.word_explain = word_explain;
	}
	public String GetWord_explain() {
		return this.word_explain;
	}
}
