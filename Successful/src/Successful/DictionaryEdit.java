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
public class DictionaryEdit {
    Dictionary dic = new Dictionary();
    void Insert(){
       Scanner input = new Scanner(System.in);
        System.out.println("Nhập từ cần thêm: ");
	String Eng = input.nextLine();
        String Vie = input.nextLine();
        Word w = new Word(Eng,Vie);
        dic.word.add(w);
    
    }
    
    void Delete(String find_word){
//        Scanner input = new Scanner(System.in);
//        String find_word = input.nextLine();
        for(int i = 0; i<dic.word.size(); i++){
            if(dic.word.get(i).GetWord_target().equals(find_word)){
                dic.word.remove(dic.word.get(i));
            }
        }
    }
    void Edit(){
        System.out.println("Nhập từ cần sửa: ");
        Scanner input = new Scanner(System.in);
        String find_word = input.nextLine();
        for(int i = 0; i<dic.word.size(); i++){
            if(dic.word.get(i).GetWord_target().equals(find_word)){
             
                System.out.println("new word target: ");
                dic.word.get(i).word_target=input.nextLine();
                System.out.println("new word explain: ");
                dic.word.get(i).word_explain=input.nextLine();
            break;
            }
        }
    }
    
//    void Edit(){
//        Insert();
//        Delete();
//    }
//    
}
