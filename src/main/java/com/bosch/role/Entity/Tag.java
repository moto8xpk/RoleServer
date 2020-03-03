package com.bosch.role.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tag_detail")
public class Tag {
    private int id;
    private String tagName;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "tag_name")
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
