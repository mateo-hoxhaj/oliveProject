package com.olive.project.model;

import javax.persistence.*;

@Entity
@Table
public class Pesticides {

    @Id
    @Column(name="pesticides_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pesticides_seq")
    @SequenceGenerator(name = "pesticides_seq", sequenceName = "pesticides_seq", allocationSize = 1)
    private Long id;
    private String pesticides_name;

    @ManyToOne
    @JoinColumn(name = "olive_id")
    private Olive olive_id;

    public Pesticides() {
    }

    public Pesticides(Long id, String pesticides_name, Olive olive_id) {
        this.id = id;
        this.pesticides_name = pesticides_name;
        this.olive_id = olive_id;
    }

}
