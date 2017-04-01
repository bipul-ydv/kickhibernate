package com.kickwithhibernate.entitymapping.collectionmapping.one2many.withxml;

import java.io.Serializable;

/**
 * Created by bhushan on 12/3/17.
 */
public class Answer implements Serializable {
    private static final long serialVersionUID = -5950352222510529959L;
    private int id;
    private String answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
