import org.simplejavamail.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.mailer.Mailer;
import org.simplejavamail.mailer.MailerBuilder;
import org.simplejavamail.mailer.config.TransportStrategy;

public class Main {

    public static void main(String[] args) {
        Email email = EmailBuilder.startingBlank()
                .from("lollypop", "airdrop@opnplatform.com")
                .to("Le Perit", "kalyamba777@gmail.com")
                .cc("C. Bo <kalyamba777@mail.com>")
                .withSubject("hey")
                .withPlainText("We should meet up! ;)")
                .buildEmail();

        MailerBuilder
                .withSMTPServer("smtps.aruba.it", 465, "airdrop@opnplatform.com", "OPNetGuru")
                .withDebugLogging(true)
                .withTransportStrategy(TransportStrategy.SMTPS)
                .buildMailer().sendMail(email);
    }
}
