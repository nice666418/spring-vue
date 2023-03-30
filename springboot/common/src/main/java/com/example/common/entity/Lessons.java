package com.example.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "lessons")
@AllArgsConstructor
@NoArgsConstructor
public class Lessons {
    @Id
    private int id;
    private String name;
}
