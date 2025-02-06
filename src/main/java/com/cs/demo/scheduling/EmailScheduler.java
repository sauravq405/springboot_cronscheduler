package com.cs.demo.scheduling;

import com.cs.demo.dto.Email;
import com.cs.demo.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
public class EmailScheduler {

    @Autowired
    private EmailService emailService;
    @Scheduled(cron = "0 * * * * *") // Every minute //tried and tested
    public void recurringActions() {
        Email email = new Email();
        email.setTo("xxxxxxx@gmail.com");
        email.setSubject("Sent from code");
        email.setBody("Sample text in body");
        emailService.sendEmail(email);
        log.info("Mail triggered at: {}", currentTimeInIST(System.currentTimeMillis()));
    }

    public String currentTimeInIST(long timeInMilliseconds) {
        // Example milliseconds
        long milliseconds = timeInMilliseconds; // Replace with your milliseconds
        // Convert milliseconds to an Instant
        Instant instant = Instant.ofEpochMilli(milliseconds);
        // Define the IST zone
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        // Convert to IST
        ZonedDateTime istTime = instant.atZone(istZone);
        // Format the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        // Print the time
        String formattedTime = istTime.format(formatter);
        return formattedTime;
    }
}
