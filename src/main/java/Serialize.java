
import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class Serialize {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) throws FileNotFoundException, IOException {
        
        ArrayList<Book> mybook = new ArrayList<Book>();
        mybook.add(new Book("The Leviathan Trilogy\t", new Author("Scott","Westerfield","Sir"),new PubDate(10,"August",2010)));
        mybook.add(new Book("The Hunger Games 1\t", new Author("Suzanne","Collins","Mrs."),new PubDate(1,"January",2008)));
        mybook.add(new Book("The Hunger Games: Catching Fire", new Author("Suzanne","Collins","Mrs."), new PubDate(1,"January",2008)));
        mybook.add(new Book("The Hunger Games: Mockingjay", new Author("Suzanne","Collins","Mrs."), new PubDate(1,"January",2008)));
        mybook.add(new Book("Harry Potter\t\t", new Author("Joanne K","Rowling","Mrs"), new PubDate(26,"June",1997)));
        
        FileOutputStream fos = new FileOutputStream("C:\\\\Dev\\IT127L\\ex1\\araullo.xml");
        XMLEncoder encoder = new XMLEncoder(fos);
        
        encoder.writeObject(mybook);
        encoder.close();
        fos.close();   
    }

    
}
