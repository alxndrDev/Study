package io.alxndr.shop.domain;

import org.hibernate.annotations.OnDelete;
import org.hibernate.criterion.Order;

import javax.persistence.*;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    private Integer orderPrice;

    private Integer count;






}
