package com.lambda.study.domain.richInterface;

/**
 * Created by user on 2017-06-14.
 */
public class Mailer {

    private String from;
    private String to;
    private String subject;
    private String body;

    public void send(){
        System.out.println("send mail");
    }

    public void from(String from) {
        this.from = from;
    }

    public void to(String to) {
        this.to = to;
    }

    public void subject(String subject) {
        this.subject = subject;
    }

    public void body(String body) {
        this.body = body;
    }
}
