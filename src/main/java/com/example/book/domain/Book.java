package com.example.book.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Book {

    @Id
    @GeneratedValue
    private Long id; //책번호
    private String name; //책이름
    private String author; //저자



}
