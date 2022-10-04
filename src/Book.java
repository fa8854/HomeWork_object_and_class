import java.util.Objects;

public class Book {

    String bookName;
   Author author;
   int publicationYear;

   public Book(String bookName, Author author, int publicationYear){
       this.author = author;
       this.bookName = bookName;
       this.publicationYear= publicationYear;
   }



    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getPublicationYear(){
   return this.publicationYear;
   }
   public void setPublicationYear(int publicationYear) {
       this.publicationYear= publicationYear;
   }
/*
   public String bookInfo(){
       return "Книга " + this.bookName + " Автор " + this.author + " Год издания: "
               + this.publicationYear;
   }

 */
   @Override
   public String toString(){
       return "Название книги : " + bookName + ", Год издания : " + publicationYear + " Автор " + this.author;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publicationYear);
    }
}
