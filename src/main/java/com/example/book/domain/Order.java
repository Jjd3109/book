package com.example.book.domain;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member member; // 회원

    @ManyToOne(fetch = FetchType.LAZY)
    private Book book; //책번호

    @Enumerated(EnumType.STRING)
    private OrderStatus status; // RENT , CANCEL 빌려갔는지 안빌려갔는지 !

}
