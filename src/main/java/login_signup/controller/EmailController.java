package login_signup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import login_signup.service.EmailService;

@Controller
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/uploadbill")
    @ResponseBody
    public ResponseEntity<String> sendBill(@RequestParam String userId,
                                           @RequestParam String clientEmail,
                                           @RequestParam String subject,
                                           @RequestParam String message,
                                           @RequestParam double billAmount) {

        // Compose the email body
        String body = "Dear Customer,\n\n"
                + "Your order bill amount is: GHC" + billAmount + "\n\n"
                + "Additional Message: " + message;

        // Send the bill email to the client
        emailService.sendOrderBill("asmahpaakwesi59@gmail.com", clientEmail, subject, body);

        return ResponseEntity.ok("Bill sent successfully!");
    }
}
