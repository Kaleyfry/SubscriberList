package com.tts.subscriberlist.subscriber;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubscriberController {

    // Tells our application what template to return at a specific URL
    @GetMapping
    public String index(Subscriber subscriber) {
        return "subscriber/index";
    }

}