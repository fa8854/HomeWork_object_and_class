public class Main {


    public static void main(String[] args) {
       Author bookOne = new Author("Алек","Форвард");
       Author bookTwo = new Author("Алек","Форвард");
       Book bookOneAuthor = new Book("Форватр",bookOne,2021);
       Book bookTwoAuthor = new Book("Столовая книга",bookTwo,2020);
       bookOneAuthor.equals(bookTwoAuthor);

        System.out.println(bookTwoAuthor);
        bookTwoAuthor.setPublicationYear(2010);
        System.out.println(bookTwoAuthor);
        System.out.println(bookOneAuthor);
        if (bookOne.equals(bookTwo)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (bookOne.hashCode()==bookTwo.hashCode()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if (bookOneAuthor.equals(bookTwoAuthor)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (bookOneAuthor.hashCode() == bookTwoAuthor.hashCode()){
            System.out.println("true");
        }






    }


}