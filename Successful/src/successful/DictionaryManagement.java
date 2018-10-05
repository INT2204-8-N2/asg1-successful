/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package successful;
import java.util.*;
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
}
