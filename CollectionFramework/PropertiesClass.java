package CollectionFramework;
import java.io.*;
import java.util.*;

//it is similar like hash table but only thing is the Each key and its corresponding value in the property list is a string.

//Properties inherits from Hashtable, the put and putAll methods can be applied to a Properties object.

import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {

        Properties p = new Properties();
        Properties p2 = new Properties();
/*

        p.setProperty("A","Aditya");
        p.setProperty("B","Bipul");
        p.setProperty("C","chitrance");
        p.setProperty("D","danny");

        p.store(new FileOutputStream("C:/Users/Aditya raj/Documents/properties.txt"),"printed");
        p.list(new PrintStream("C:/Users/Aditya raj/Documents/properties.txt")); // after running this method , the previous p.store() result is deleted from file.
        p.save(new FileOutputStream("C:/Users/Aditya raj/Documents/pro.txt"),"Saved"); // same as list().
        */
/*This method does not throw an IOException if an I/O error occurs while saving the property list. The preferred way to save a properties list is via the store(OutputStream out, String comments) method or the*//*


        p.setProperty("E","Elephant");

        p.storeToXML(new FileOutputStream("C:/Users/Aditya raj/Documents/xml.xml"),""); // makes an xml file and stores its properties in it.

*/
        p.loadFromXML(new FileInputStream("C:/Users/Aditya raj/Documents/xml.xml")); // from xml file

        p2.load(new FileInputStream("C:/Users/Aditya raj/Documents/pro.txt")); // from txt file

        System.out.println(p);
        System.out.println(p2);
    }
}
