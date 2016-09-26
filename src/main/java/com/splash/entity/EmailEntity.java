package com.splash.entity;

import org.springframework.data.annotation.Id;

public class EmailEntity {

    @Id
    public String id;

    public String Email;
    public String Nome;


    public EmailEntity() {}

    public EmailEntity(String Email, String Nome) {
        this.Email = Email;
        this.Nome = Nome;

    }

    @Override
    public String toString() {
        return String.format(
                "EmailEntity[id=%s, Email='%s', Nome ='%s']",
                id, Email, Nome);
    }

}
