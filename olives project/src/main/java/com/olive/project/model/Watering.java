package com.olive.project.model;

import javax.persistence.*;

@Entity
@Table
public class Watering {

    @Id
    @Column(name="watering_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "watering_seq")
    @SequenceGenerator(name = "watering_seq", sequenceName = "watering_seq", allocationSize = 1)

    private String watering_time;
    private String water_quantity;

    @ManyToOne
    @JoinColumn(name = "olive_id")
    private Olive olive_id;

    public Watering() {
    }

    public Watering(String watering_time, String water_quantity, Olive olive_id) {
        this.watering_time = watering_time;
        this.water_quantity = water_quantity;
        this.olive_id = olive_id;
    }

}
