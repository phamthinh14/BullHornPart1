package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    MessageRepository messageRepository;

    @Override
    public void run(String... args) throws Exception {
        Message message = new Message("Powerful, tireless, with a thick all-white coat impervious to cold—Sammies are perfectly beautiful but highly functional",
                              "05-06-2016", "Arnolad", "https://res.cloudinary.com/dzk3cvgwt/image/upload/v1558108435/Samoyed-1-e1534278656230_thm6aq.jpg");
       messageRepository.save(message);
        message = new Message("Once the mischievous companion of Chinese emperors, and later the mascot of Holland’s royal House of Orange, the small but solid",
                "02-07-2000", "Hasmin", "https://res.cloudinary.com/dzk3cvgwt/image/upload/v1558107590/uwxrc0aac1rd6qpr6ap6.jpg");
        messageRepository.save(message);
        message = new Message("The one-of-a-kind French Bulldog, with his large bat ears and even disposition, is one of the world’s most popular small-dog breeds, especially among city dwellers",
                "07-16-2018", "Mints", "https://res.cloudinary.com/dzk3cvgwt/image/upload/v1558108688/6164ose4TgL._SX425__suvduz.jpg");
        messageRepository.save(message);

    }

}
