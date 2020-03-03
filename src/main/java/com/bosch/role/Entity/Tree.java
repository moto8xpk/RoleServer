package com.bosch.role.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tree_structure_detail")
public class Tree {
    private int id;
    private String treeName;

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "structure_name")
    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
