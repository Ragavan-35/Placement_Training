/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static class Book{
        String title;
        String author;
        int price;
        
        
        
        Book(String title,String author,int price){
            this.title=title;
            this.author=author;
            this.price=price;
            System.out.println("The Book Title is :" +title);
            System.out.println("The Book Author is :" +author);
            System.out.println("The Book Price is :" +price);
        }
    }
	public static void main(String[] args) {
	    Book books=new Book("java","ragav",20000000);
	}
}
