package user_registration.domain;

public class Email {
    private final String emailAddress;
    private final String subject;
    private final String body;

    public Email(String emailAddress, String subject, String body) {
        this.emailAddress = emailAddress;
        this.subject = subject;
        this.body = body;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }
}
