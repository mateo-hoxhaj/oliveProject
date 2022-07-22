package com.olive.project.model;

import javax.persistence.*;

@Entity
@Table(name="OliveForm")
public class OliveForm {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "form_seq")
    @SequenceGenerator(name = "form_seq", sequenceName = "form_seq", allocationSize = 1)
    private Long id;

    private String form_name;

    @ManyToOne
    @JoinColumn(name = "olive_id")
    private Olive olive_id;


    @ManyToOne
    @JoinColumn(name = "usage_id")
    private Usage usage_id;

    public OliveForm() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public Olive getOlive_id() {
        return olive_id;
    }

    public void setOlive_id(Olive olive_id) {
        this.olive_id = olive_id;
    }

    public Usage getUsage_id() {
        return usage_id;
    }

    public void setUsage_id(Usage usage_id) {
        this.usage_id = usage_id;
    }


    public OliveForm(Long id, String form_name, Olive olive_id) {
        this.id = id;
        this.form_name = form_name;
        this.olive_id = olive_id;

    }
}
