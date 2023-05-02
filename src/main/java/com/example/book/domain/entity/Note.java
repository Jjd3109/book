package com.example.book.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder //빌더패턴 !!
@Getter
@AllArgsConstructor //생성자를 전부 만들어준다
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Note {

    @Id
    @GeneratedValue
    @Column(name="note_id")
    private Long id;

    private String title;

    private String content;


}
