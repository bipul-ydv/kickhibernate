package com.kickwithhibernate.generatorclassesinhibernate.guid;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

/**
 * Created by bhushan on 9/3/17.
 */
@Entity(name = "guid_generator")
public class Guid implements Serializable {
    private static final long serialVersionUID = -1088996925238167920L;
    @Id
    @GeneratedValue(generator = "guid" )
    @GenericGenerator(name = "guid", strategy = "guid")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
