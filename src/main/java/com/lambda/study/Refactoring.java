package com.lambda.study;

import com.lambda.study.domain.richInterface.FluentMailer;
import com.lambda.study.domain.richInterface.Mailer;
import com.lambda.study.domain.richInterface.MailerBuilder;

/**
 * Created by user on 2017-06-09.
 */
public class Refactoring {

    public void send(){
        Mailer mailer = new Mailer();
        mailer.from("from@abc.co.kr");
        mailer.to("to@abc.co.kr");
        mailer.subject("don't do this way");
        mailer.body("...your code sucks...");
        mailer.send();
    }

    public void builderSend(){
        new MailerBuilder()
                .from("from@abc.co.kr")
                .to("to@abc.co.kr")
                .subject("it's not too bad")
                .body("..it sucks less...")
                .send();
    }

    public void refactoredSend(){
        FluentMailer.send(mailer->
             mailer.from("from@abc.co.kr")
                   .to("to@abc.co.kr")
                   .subject("use lambda")
                   .body("it is nice")
        );
    }
}
