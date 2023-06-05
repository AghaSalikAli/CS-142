public class driver1 {
    public static void main(String[] args) {
        Author author1 = new Author("JK Rowling", "jkrolwing@gmail.com", 'f');
        Author author2 = new Author("Charles Dickens", "cd@gmail.com", 'm');
        Author [] authors = new Author[2];
        authors[0] = author1;
        authors [1] = author2;
        Book book = new Book ("Wizards with Oliver", authors, 120.5, 100);
        System.out.println(book);
    }
}
