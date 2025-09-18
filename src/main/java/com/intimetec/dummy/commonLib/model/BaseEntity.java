package com.intimetec.dummy.commonLib.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(hidden = true)
    private Long id;

    @CreatedBy
    @Column(name = "created_by", updatable = false)
    @Schema(hidden = true)
    private String createdBy;

    @CreatedDate
    @Schema(hidden = true)
    private LocalDateTime createdOn;

    @LastModifiedBy
    @Column(name = "modified_by")
    @Schema(hidden = true)
    private String modifiedBy;

    @LastModifiedDate
    @Schema(hidden = true)
    private LocalDateTime modifiedOn;
}
