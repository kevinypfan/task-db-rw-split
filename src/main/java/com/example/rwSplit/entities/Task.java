package com.example.rwSplit.entities;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
@Table(name="test_tasks")
public class Task {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Boolean completed = false;
    private Integer priority = 1;
    @Column(name = "date_add")
    @CreatedDate
    private Timestamp dateAdd;

    @Column(name = "date_upd")
    @LastModifiedDate
    private Timestamp dateUpd;
}
