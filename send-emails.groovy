@Grab('com.sun.mail:javax.mail:1.6.2')
import javax.mail.*
import javax.mail.internet.*

def sendEmail(subject, content) {
    def props = new Properties()
    props.put("mail.smtp.host", "smtp.example.com")
    props.put("mail.smtp.port", "587")
    props.put("mail.smtp.auth", "true")
    props.put("mail.smtp.starttls.enable", "true")

    def session = Session.getInstance(props, new Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("your_email@example.com", "your_password")
        }
    })

    def message = new MimeMessage(session)
    message.setFrom(new InternetAddress("your_email@example.com"))
    message.setRecipients(Message.RecipientType.TO, "recipient@example.com")
    message.setSubject(subject)
    message.setText(content)

    Transport.send(message)
    println "Email sent!"
}

sendEmail("Daily Report", "This is your daily report content.")