package com.example.book.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.engine.internal.Cascade;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL) //mappedBy -> 누가 주인인지 정하는거!  cascade -> 저장해주는거
    private List<OrderItem> orderItems = new ArrayList<>();


    @Enumerated(EnumType.STRING)
    private OrderStatus status; // RENT , CANCEL 반납되어있는지 안되어있는지.

}
