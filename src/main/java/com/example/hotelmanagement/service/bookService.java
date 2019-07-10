package com.example.hotelmanagement.service;

import com.example.hotelmanagement.entity.book;
import com.example.hotelmanagement.entity.remainRoom;

import java.util.Date;
import java.util.List;

public interface bookService {
    public book queryBookByBookId(int bookId);

    public int bookToHistory(String bookId,Date arrive,Date depart,float money,String phone,String state);
    public int deleteBook(int bookId);


    public int payOrder(int bookId);

    public List<remainRoom> queryRemainByDate(Date date);
    public List<book> queryBookByPhone(String phone);
    public int addOrder(book book);
}
