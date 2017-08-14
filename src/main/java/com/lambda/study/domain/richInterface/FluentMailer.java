package com.lambda.study.domain.richInterface;

import java.util.function.Consumer;

/**
 * Created by user on 2017-06-15.
 */
public class FluentMailer {

    private FluentMailer() {}


    private String from;
    private String to;
    private String subject;
    private String body;


    public static void send(final Consumer<FluentMailer> block){
        final FluentMailer mailer = new FluentMailer();
        block.accept(mailer);
        System.out.println(mailer.toString());
        System.out.println("send mail");
    }

    public FluentMailer from(String from) {
        this.from = from;
        return this;
    }

    public FluentMailer to(String to) {
        this.to = to;
        return this;
    }

    public FluentMailer subject(String subject) {
        this.subject = subject;
        return this;
    }

    public FluentMailer body(String body) {
        this.body = body;
        return this;
    }

    @Override
    public String toString() {
        return "FluentMailer{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
