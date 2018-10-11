/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Successful;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class DictionaryManagement {
    Dictionary dic = new Dictionary();
    void insertFromCommandline() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so luong tu: ");
		int n;
		n = input.nextInt();
		input.nextLine();
		for( int i = 0; i < n; i++)
		{
			String Eng = input.nextLine();
			String Vie = input.nextLine();
			Word w = new Word(Eng,Vie);
			dic.word.add(w);
		}
	}
    void insertFromFile(){

        File file = new File("dictionaries.txt");
       
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            int i = 0;
            String line = "";
            for (i = 0; (line = br.readLine()) != null; i++) {
                Word ex = new Word();
                String[] a = line.split("\\s", 2);
                ex.word_explain = a[1];
                ex.word_target = a[0];
                dic.word.add(ex);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    public String dictionaryLookup(String find_word){

        String result = "Không có từ để hiển thị !!!";
        for(int i=0; i<dic.word.size(); i++){
            if(dic.word.get(i).GetWord_target().equals(find_word))
                result = dic.word.get(i).GetWord_explain();
        }
        return result;
    }
    public void dictionarySearcher(){
      
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập từ: ");
        String s = input.nextLine();
        for(int i=0;i<dic.word.size();i++){
            if(dic.word.get(i).GetWord_target().startsWith(s))
                System.out.println(dic.word.get(i).GetWord_target()+"~~"+dic.word.get(i).GetWord_explain());
        }
    }
}

    
