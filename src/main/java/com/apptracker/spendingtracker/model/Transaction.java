package com.apptracker.spendingtracker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transaction {
    @Id
    @SequenceGenerator(name = "trans_seq_gen", sequenceName = "trans_seq_gen", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trans_seq_gen")
    private Integer transactionID;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user; // Foreign key User
    private Long amount;
    private Date date;
    private String note;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category; // Foreign key Category
}
