package com.kickwithhibernate.entitymapping.inheritancemapping.tablepersubclass.withxml;

import java.io.Serializable;

/**
 * Created by bhushan on 12/3/17.
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 5314943103407852689L;
    private Long id;
    private String name;

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
}
