package OOPs;

public class Book_detail {
    
    static class Book {
        private String title;
        private String author;
        private int pages;
    
        public Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }
    
        public void displayInfo() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + pages);
        }
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 281);
        Book book2 = new Book("1984", "George Orwell", 328);
    
        System.out.println("Details of Book 1:");
        book1.displayInfo();
    
        System.out.println("\nDetails of Book 2:");
        book2.displayInfo();
    }
}

