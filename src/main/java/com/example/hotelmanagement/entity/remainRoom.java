package com.example.hotelmanagement.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class remainRoom implements Serializable {
    String typeName;
    int remain;

}
