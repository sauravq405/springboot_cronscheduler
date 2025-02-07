# Email Scheduler Application

This application leverages Spring Boot's cron scheduling to automatically send emails at specified times. Here's how it works:

## Features

- **Scheduled Email Sending**: Uses cron expressions to define when emails should be sent.
- **Time Logging**: Logs the time at which each email is scheduled to be sent in Indian Standard Time (IST).

## Setup

### Dependencies

- **Spring Boot Starter** for cron scheduling and web capabilities.
- **Spring Boot Starter Mail** for email sending functionality.

### Configuration

To configure and run the application:

1. **Application Properties**: If you are not creating a @Bean in a @Configuration class, then define your SMTP settings in `application.properties` or `application.yml`:

    ```properties
    spring.mail.host=smtp.gmail.com
    spring.mail.port=587
    spring.mail.username=your-email@gmail.com
    spring.mail.password=your-gmail-app-password
    spring.mail.properties.mail.smtp.auth=true
    spring.mail.properties.mail.smtp.starttls.enable=true

2. **Running the Application**:

- Build and run the application using your preferred IDE or via CLI with ```mvn spring-boot:run``` if using Maven.
- The application will automatically send emails based on the schedule you've set.

### API Access

The email sending functionality can be tested or used manually via the Swagger UI.

  **Email Sending API**:
- **URL:** [http://localhost:8090/swagger-ui/index.html#/email-controller/sendEmail](http://localhost:8090/swagger-ui/index.html#/email-controller/sendEmail)
- **Note:** Users need to use their own credentials, specifically their email ID and Gmail app password, to send emails to Gmail accounts from this endpoint.

### Conclusion 

This application demonstrates how to integrate cron scheduling with email sending in Spring Boot, providing both automated email dispatch and logging of when these emails are scheduled in IST. Remember, for security, do not hardcode your email credentials in your source code; use environment variables or a secure configuration mechanism instead.

For generating gmail app password, you may refer to the below link: <br>
visit [YouTube Tutorial](https://www.youtube.com/watch?v=MkLX85XU5rU&t=1s).