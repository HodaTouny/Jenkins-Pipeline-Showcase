package org.example;


import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Effective Java", "Joshua Bloch");

        library.addBook(book);

        assertEquals(1, library.getBooks().size());
        assertEquals("Effective Java", library.getBooks().get(0).getTitle());
    }

    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        Book foundBook = library.findBookByTitle("Clean Code");
        assertNotNull(foundBook);
        assertEquals("Clean Code", foundBook.getTitle());
    }

    @Test
    public void testFindBookByTitleNotFound() {
        Library library = new Library();

        Book foundBook = library.findBookByTitle("Nonexistent Book");
        assertNull(foundBook);
    }

    @Test
    public void testAddBookInvalid() {
        Library library = new Library();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(null);
        });

        assertEquals("Book details are incomplete!", exception.getMessage());
    }

    @Test
    public void testFindBookWithInvalidTitle() {
        Library library = new Library();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            library.findBookByTitle("");
        });

        assertEquals("Title cannot be null or empty!", exception.getMessage());
    }
}
