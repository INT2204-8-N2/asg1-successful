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
//        String fileName = "dictionaries";
//        try (Stream<String> stream = Files.lines(Paths.get(fileName), StandardCharsets.UTF_8)) {
//            stream.forEach(line -> {
//                String[] words = line.split("\\s",2);
//                String anh = words[0];
//                String viet = words[1];
//                Word w = new Word(anh, viet);
//                x.word.add(w);
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
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
                x.word.add(ex);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    void dictionaryLookup(){
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
        System.out.println("Nhập từ :");
        String s = input.nextLine();
        for(int i=0;i<x.word.size();i++){
            if(x.word.get(i).GetWord_target().startsWith(s))
                System.out.println(x.word.get(i).GetWord_target());
        }
    }
}

    
