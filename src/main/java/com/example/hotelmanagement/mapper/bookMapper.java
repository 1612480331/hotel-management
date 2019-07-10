package com.example.hotelmanagement.mapper;

import com.example.hotelmanagement.entity.book;
import com.example.hotelmanagement.entity.remainRoom;

import java.util.Date;
import java.util.List;

public interface bookMapper {
    public book queryBookByBookId(int bookId);

    public int bookToHistory(String bookId,Date arrive,Date depart,float money,String phone,String state);
    public int deleteBook(int bookId);

    public int payOrder(int bookId);

    //查询所有房间的余量当前日期
    public List<remainRoom> queryRemainByDate(Date date);
    //通过用户手机号查询订单
    public List<book> queryBookByPhone(String phone);
    public List<book> queryBookByPhoneAndArrive(String phone, Date arrive);
    //添加预定记录
    public int  addOrder(book book);
}
