

import java.util.Scanner;

class Books {
    double price;
    String Book_name;

    public Books(double price, String Book_name) {
        this.price = price;
        this.Book_name = Book_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

    }

    //public String getBook_name() {



    public void details() {
        System.out.println("the book name is " + Book_name + "price is " + price);
    }
}
public class Bookceck{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Books[] bk = new Books[5];
        for (Books b : bk) {
            ;
        }
    }


 }
