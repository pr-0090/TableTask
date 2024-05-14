package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name="ground_id")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Ground {

    @GeneratedValue(generator = "ground_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="ground_seq_gen", sequenceName = "ground_seq_gen",allocationSize=1)
    @Id
    private Integer id;

    @Column(name="Ground_name", nullable = false, length =100)
    private String name;


}
