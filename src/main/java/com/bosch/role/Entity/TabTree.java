package com.bosch.role.Entity;

import javax.persistence.*;

@Entity
@Table(name = "tag_table")
public class TabTree{
    private int id;

    private int head;

    private int tail;

    private int tree;

    @Id
    @GeneratedValue
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="head_id")
    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    @Column(name="tail_id")
    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    @Column(name="tree_id")
    public int getTree() {
        return tree;
    }

    public void setTree(int tree) {
        this.tree = tree;
    }
}
