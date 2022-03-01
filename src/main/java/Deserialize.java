
import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ginoa
 */
public class Deserialize {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<Book> mybook;
        
        try(FileInputStream fim = new FileInputStream("C:\\\\Dev\\IT127L\\ex1\\araullo.xml");
                XMLDecoder decoder = new XMLDecoder(fim)) {
            mybook = (ArrayList<Book>) decoder.readObject();
        }
        System.out.println("Book XML Reader\n");
        System.out.println("Title \t\t\t\t\tAuthor \t\t\t\tPublished On");
        
        for(Book con:mybook){
            System.out.println(con.getBookTitle() + "\t\t" + con.getName().getTitle() + " " +
                    con.getName().getFirstname() + " " + con.getName().getLastname() + "\t\t" +
                    con.getDate().getMonth() + " " + con.getDate().getDay() + ", " + con.getDate().getYear());
        }
    }
}
