package com.lambda.study.domain.richInterface;

/**
 * Created by user on 2017-06-15.
 */
public class MailerBuilder {

    private String from;
    private String to;
    private String subject;
    private String body;

    public void send(){
        System.out.println("send mail");
    }

    public MailerBuilder from(String from) {
        this.from = from;
        return this;
    }

    public MailerBuilder to(String to) {
        this.to = to;
        return this;
    }

    public MailerBuilder subject(String subject) {
        this.subject = subject;
        return this;
    }

    public MailerBuilder body(String body) {
        this.body = body;
        return this;
    }
}
