package studystuff_interview_questions_all;
 
import java.util.List;
import java.util.Properties;
 
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
 
public class Mail {
 
      
       private String smtpHost;
    private String fromAddress;
    private List<String> toAddresses;
    private List<String> ccAddresses;
    private String subject;
    private String emailBody;
    private String emailBodyType;
    private MimeBodyPart attachments;
 
    public Mail(String smtpHost, String fromAddress, List<String> toAddresses, List<String> ccAddresses, String subject, String emailBody, String emailBodyType, MimeBodyPart attachments) {
        this.smtpHost = smtpHost;
        this.fromAddress = fromAddress;
        this.toAddresses = toAddresses;
        this.ccAddresses = ccAddresses;
        this.subject = subject;
        this.emailBody = emailBody;
        this.emailBodyType = emailBodyType;
        this.attachments = attachments;
    }
 
    public void send() {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", this.smtpHost);
        Session session = Session.getDefaultInstance((Properties)properties);
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom((Address)new InternetAddress(this.fromAddress));
            for (String recipient2 : this.toAddresses) {
                message.addRecipient(Message.RecipientType.TO, (Address)new InternetAddress(recipient2));
            }
            for (String recipient2 : this.ccAddresses) {
                message.addRecipient(Message.RecipientType.CC, (Address)new InternetAddress(recipient2));
            }
            message.setSubject(this.subject);
            MimeMultipart multipart = new MimeMultipart();
            MimeBodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent((Object)this.emailBody, this.emailBodyType);
            multipart.addBodyPart((BodyPart)messageBodyPart);
            //for (BodyPart attachment : this.attachments) {
                multipart.addBodyPart(attachments);
            //}
            message.setContent((Multipart)multipart);
            Transport.send((Message)message);
        }
        catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}