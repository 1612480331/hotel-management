package com.example.hotelmanagement.serviceImpl;

import com.example.hotelmanagement.entity.book;
import com.example.hotelmanagement.entity.remainRoom;
import com.example.hotelmanagement.mapper.bookMapper;
import com.example.hotelmanagement.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service(value = "book")
public class bookServiceImpl implements bookService {

    @Autowired
    private bookMapper bookMapper;
    @Override
    public List<remainRoom> queryRemainByDate(Date date) {
        System.out.println(date);
        return bookMapper.queryRemainByDate(date);
    }

    @Override
    public List<book> queryBookByPhone(String phone) {
        return bookMapper.queryBookByPhone(phone);
    }

    @Override
    public int addOrder(book book) {
        return bookMapper.addOrder(book);
    }
    @Override
    public int payOrder(int bookId) {
        return bookMapper.payOrder(bookId);
    }

    @Override
    public int bookToHistory(String bookId, Date arrive, Date depart, float money, String phone, String state) {
        return bookMapper.bookToHistory(bookId, arrive, depart, money, phone, state);
    }

    @Override
    public int deleteBook(int bookId) {
        return bookMapper.deleteBook(bookId);
    }

    @Override
    public book queryBookByBookId(int bookId) {
        return bookMapper.queryBookByBookId(bookId);
    }


}
