package com.olive.project.model;

import javax.persistence.*;

@Entity
@Table
public class Pruning {
    @Id
    @Column(name="pruning_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pruning_seq")
    @SequenceGenerator(name = "pruning_seq", sequenceName = "pruning_seq", allocationSize = 1)

    private Long id;
    private String prunin_time;
    private String prunin_type;

    @ManyToOne
    @JoinColumn(name = "olive_id")
    private Olive olive_id;

    public Pruning() {
    }

    public Pruning(Long id, String prunin_time, String prunin_type, Olive olive_id) {
        this.id = id;
        this.prunin_time = prunin_time;
        this.prunin_type = prunin_type;
        this.olive_id = olive_id;
    }

}
