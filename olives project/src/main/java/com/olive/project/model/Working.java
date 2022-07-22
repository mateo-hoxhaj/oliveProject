package com.olive.project.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Working {

    @Id
    @Column(name="working_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "working_seq")
    @SequenceGenerator(name = "working_seq", sequenceName = "working_seq", allocationSize = 1)
    private Long id;

    private String working_name;
    private String working_type;
    private Date working_time;

    @ManyToOne
    @JoinColumn(name = "olive_id")
    private Olive olive_id;

    public Working() {
    }

    public Working(Long id, String working_name, String working_type, Date working_time, Olive olive_id) {
        this.id = id;
        this.working_name = working_name;
        this.working_type = working_type;
        this.working_time = working_time;
        this.olive_id = olive_id;
    }

}
