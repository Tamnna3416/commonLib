package com.intimetec.dummy.commonLib.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payments")
public class Payment extends BaseEntity {


    private Long orderId;

    private Long customerId;

    private Double amount;

    private String paymentMethod;

    private String description;
}
