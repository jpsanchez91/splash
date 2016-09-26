package com.splash.entity;

import org.springframework.data.annotation.Id;

public class RespostaEntity {
	
	    @Id
	    public String id;
	    public String Email;
	    public String Nome;
	    public String p1;
	    public String p2;
	    public String p3;

	    public RespostaEntity() {}

	    public RespostaEntity(String Email, String Nome, String p1, String p2, String p3) {
	        this.Email = Email;
	        this.Nome = Nome;
	        this.p1 = p1;
	        this.p2 = p2;
	        this.p3 = p3;

	    }

	    @Override
	    public String toString() {
	        return String.format(
	                "EmailEntity[id=%s, Email='%s', Nome ='%s']",
	                id, Email, Nome);
	    }

}
