import org.junit.jupiter.api.Test;

public class CLIRunnerTest {

    // Delete a book (via ISBN)
    //Delete a book copy (via ID)
    //Delete a customer (via ID)
    Library library = new Library();
    Book book = new Book("Title1", "Author1", "ISBN1");
    BookCopy bookCopy = new BookCopy("Title2", "Author2", "ISBN2", false);
    Customer customer = new Customer("Name1", "ID1", BookList);

    @Test
    void DeleteBookTest() {
        libray.addBook(book);
        library.deleteBook("ISBN1");
        assertEquals(0, library.getBooks.size());
    }
    @Test
    void DeleteBookCopyTest() {
        library.addBookCopy(bookCopy);
        if(bookCopy.isBorrowed() == false) {
            library.deleteBookCopy("ISBN2");
            assertEquals(0, library.getBooksCopies.size());
        }
        assertEquals(1, library.getBooksCopies.size());
    }
    @Test
    void DeleteCustomerTest() {
        library.addCustomer(customer);
        library.deleteCustomer("ID1");
        assertEquals(0, library.getCustomers.size());
    }





}
