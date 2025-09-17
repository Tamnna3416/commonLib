package com.intimetec.dummy.commonLib.model;

import com.intimetec.dummy.commonLib.model.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order extends BaseEntity {
    private Long customerId;

    @Enumerated(EnumType.STRING)
    private OrderType orderType;

    private String description;
}
