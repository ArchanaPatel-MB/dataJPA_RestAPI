package com.example.demo.entities;

import javax.persistence.*;

@Entity
@Table(name="u_ser")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String city;
    private String name;

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public User(Integer id, String city, String name, String status) {
        this.id = id;
        this.city = city;
        this.name = name;
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println(name+"..................................................................");
        this.name = name;
        System.out.println(name+"..................................................................");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
