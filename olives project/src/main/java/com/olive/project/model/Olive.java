package com.olive.project.model;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Olive {


    @Id
    @Column(name = "olive_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "olive_seq")
    @SequenceGenerator(name = "olive_seq", sequenceName = "olive_seq", allocationSize = 1)
    private Long id;

    private String name;
    private LocalDate date_of_plant;
    private int age;
    private String origine;
    private String usage;
    private Double production_quantity_kg;
    private Double oil_percentage;
    ;
    private String oil_quality;
    private Double oliveprice_per_kg;
    private Double oil_price_per_kg;

    public Olive() {
    }

    public Olive(String name, LocalDate date_of_plant, int age, String origine, String usage, Double production_quantity_kg, Double oil_percentage, String oil_quality, Double oliveprice_per_kg, Double oil_price_per_kg) {
        this.id = id;
        this.name = name;
        this.date_of_plant = date_of_plant;
        this.age = age;
        this.origine = origine;
        this.usage = usage;
        this.production_quantity_kg = production_quantity_kg;
        this.oil_percentage = oil_percentage;
        this.oil_quality = oil_quality;
        this.oliveprice_per_kg = oliveprice_per_kg;
        this.oil_price_per_kg = oil_price_per_kg;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate_of_plant() {
        return date_of_plant;
    }

    public void setDate_of_plant(LocalDate date_of_plant) {
        this.date_of_plant = date_of_plant;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public Double getProduction_quantity_kg() {
        return production_quantity_kg;
    }

    public void setProduction_quantity_kg(Double production_quantity_kg) {
        this.production_quantity_kg = production_quantity_kg;
    }

    public Double getOil_percentage() {
        return oil_percentage;
    }

    public void setOil_percentage(Double oil_percentage) {
        this.oil_percentage = oil_percentage;
    }

    public String getOil_quality() {
        return oil_quality;
    }

    public void setOil_quality(String oil_quality) {
        this.oil_quality = oil_quality;
    }

    public Double getOliveprice_per_kg() {
        return oliveprice_per_kg;
    }

    public void setOliveprice_per_kg(Double oliveprice_per_kg) {
        this.oliveprice_per_kg = oliveprice_per_kg;
    }

    public Double getOil_price_per_kg() {
        return oil_price_per_kg;
    }

    public void setOil_price_per_kg(Double oil_price_per_kg) {
        this.oil_price_per_kg = oil_price_per_kg;
    }

    @Override
    public String toString() {
        return "Olive{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date_of_plant=" + date_of_plant +
                ", age=" + age +
                ", origine='" + origine + '\'' +
                ", usage='" + usage + '\'' +
                ", production_quantity_kg=" + production_quantity_kg +
                ", oil_percentage=" + oil_percentage +
                ", oil_quality='" + oil_quality + '\'' +
                ", oliveprice_per_kg=" + oliveprice_per_kg +
                ", oil_price_per_kg=" + oil_price_per_kg +
                '}';
    }
}
