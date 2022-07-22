package com.olive.project.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Fertilizing {

    @Id
    @Column(name="fertilizing_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fertilizing_seq")
    @SequenceGenerator(name = "fertilizing_seq", sequenceName = "fertilizing_seq", allocationSize = 1)
    private Long id;
    private String fertilizing_name;
    private String fertilizing_type;
    private Date fertilizing_time;


    @ManyToOne
    @JoinColumn(name = "olive_id")
    private Olive olive_id;

    public Fertilizing() {
    }

    public Fertilizing(Long id, String fertilizing_name, String fertilizing_type, Date fertilizing_time, Olive olive_id) {
        this.id = id;
        this.fertilizing_name = fertilizing_name;
        this.fertilizing_type = fertilizing_type;
        this.fertilizing_time = fertilizing_time;
        this.olive_id = olive_id;
    }
}
