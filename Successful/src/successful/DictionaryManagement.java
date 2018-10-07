/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package successful;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
/**
 *
 * @author dell
 */
public class DictionaryManagement {
    Dictionary x = new Dictionary();
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
			x.word.add(w);
		}
	}
        void insertFromFile(){
            Dictionary x = new Dictionary();
        String fileName = "dictionaries";
        try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
            stream.forEach(line -> {
                String[] words = line.split("\t");
                String anh = words[0];
                String viet = words[1];
                Word w = new Word(anh, viet);
                x.word.add(w);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        void dictionaryLookup(){
        Dictionary x = new Dictionary();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tu can tra: ");
        String find_word = input.nextLine();
        for(int i=0; i<x.word.size(); i++){
            if(x.word.get(i).GetWord_target().equals(find_word))
                System.out.println(x.word.get(i).GetWord_explain());
        }
    }
        void dictionarySearcher(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập từ :");
        String s = input.nextLine();
        for(int i=0;i<Dictionary.word.size();i++){
            if(Dictionary.word.get(i).GetWord_target().startsWith(s))
                System.out.println(Dictionary.word.get(i).GetWord_target());
        }
    }
}

    
