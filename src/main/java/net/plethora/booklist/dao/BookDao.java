package net.plethora.booklist.dao;

import net.plethora.booklist.model.Book;

import java.util.List;

public interface BookDao {

    public void addBook(Book book);
    public void updateBook(Book book);
    public void removeBook(int id);
    public Book getBookById(int id);
    public List<Book> showBooks();

}
