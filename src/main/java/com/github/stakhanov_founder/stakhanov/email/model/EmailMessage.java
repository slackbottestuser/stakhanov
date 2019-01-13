package com.github.stakhanov_founder.stakhanov.email.model;

import java.util.List;

import javax.mail.internet.InternetAddress;

public interface EmailMessage {

    InternetAddress getSender();

    List<InternetAddress> getToRecipients();

    String getSubject();

    String getTextBody();

    String getTextBodyWithoutQuotedText();
}
