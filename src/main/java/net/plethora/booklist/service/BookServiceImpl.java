package net.plethora.booklist.service;

import net.plethora.booklist.dao.BookDao;
import net.plethora.booklist.model.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    @Override
    @Transactional
    public void addBook(Book book) {
this.bookDao.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
this.bookDao.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
this.bookDao.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return this.bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> showBooks() {
        return this.bookDao.showBooks();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}