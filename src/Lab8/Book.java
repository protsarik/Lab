package Lab8;

public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;

    public int hashCode(){
        return ISBN;
    }

    public boolean equals(Object obj){
        if (!(obj instanceof Book)){
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }

    public static void main(String[] args){
       int c = 7;
       int result = 4;
       result += ++c;
        System.out.println(result);
    }
}
