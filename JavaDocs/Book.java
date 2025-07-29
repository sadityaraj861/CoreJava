/**@author Aditya Raj
 * @version 2.0
 * @since 2015
 **/
//we use Slash double Star for documentation start.
package JavaDocs;
/**
 * @author Aditya Raj
 *
 * class for Library Book
 */
public class Book {
    /**
     * @value 10 default value
     */
    static int val=10;

    /**
     *parametrized constructor
     * @param s Book Name
     */
    public Book(String s){}

    /**
     *Issue Book to a Student
     * @param roll roll no of Student
     * @throws Exception if Book is not available,throws Exception
     */
    public void issue(int roll)throws Exception{}

    /**
     *Check if book is available
     * @param str Book name
     * @return if book is available returns true else false
     */
    public boolean available(String str){return true;}

    /**
     *GetBook name
     * @param id Book id
     * @return returns book name
     */
    public String getName(int id){return "";}


}
