package net.proselyte.springbootdemo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name= "storages")
public class Storages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String name;
    private String article;
    private String description;
    private String category;
    private String price;
    private String quantity;
    @Column(name = "last_modified")
    private Date lastModified;
    @Column(name = "created_at")
    private Date createdAt;
}


