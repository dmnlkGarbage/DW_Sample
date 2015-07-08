package com.dmnlk.sample;

import org.hibernate.validator.constraints.Length;

/**
 * @author dmnlk
 */
public class Saying {
    private long id;

    @Length(max =  3)
    private String content;

    public Saying() {
    }

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
