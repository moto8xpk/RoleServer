package com.bosch.role.Entity;

import javax.persistence.*;

@Entity
@Table(name = "line_detail")
public class Line {
    private int id;
    private String lineName;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "line_name")
    public String getLineName() {
        return lineName;
    }

    public void setLineName(String lineName) {
        this.lineName = lineName;
    }

}
