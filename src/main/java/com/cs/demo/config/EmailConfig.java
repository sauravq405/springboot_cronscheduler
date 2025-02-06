package com.cs.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class EmailConfig {

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();

        // Set your SMTP server details
        mailSender.setHost("smtp.gmail.com"); // or whatever SMTP server you're using
        mailSender.setPort(587); // or the port your SMTP server uses

        // Set your credentials
        mailSender.setUsername("xxxxxxxxxxxxxxxxxxxx@gmail.com"); // Replace with your email
        mailSender.setPassword("xxxxxxxxxxxxxxxxxxxx"); // Replace with your gmail app password

        // JavaMail properties
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true"); // For debugging purposes, remove in production

        return mailSender;
    }
}
