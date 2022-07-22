package com.olive.project.model;

import javax.persistence.*;

@Entity
@Table
public class Usage {
    @Id
    @Column(name="usage_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usage_seq")
    @SequenceGenerator(name = "usage_seq", sequenceName = "usage_seq", allocationSize = 1)
    private Long id;

    private String usage_name;

    @ManyToOne
    @JoinColumn(name = "olive_id")
    private Olive olive_id;

    public String getUsage_name() {
        return usage_name;
    }

    public void setUsage_name(String usage_name) {
        this.usage_name = usage_name;
    }

    public Olive getOlive_id() {
        return olive_id;
    }

    public void setOlive_id(Olive olive_id) {
        this.olive_id = olive_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
