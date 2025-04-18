package com.example.chatbot;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {

    public String getResponse(String userMessage) {
        if (userMessage == null) return "Please say something!<br><br>";

        String message = userMessage.toLowerCase();

        if (message.contains("hello")) {
            return "Hi! How can I help you today?"<br><br>;
        } else if (message.contains("how are you")) {
            return "I'm good, thanks for asking!"<br><br>;
        } else if (message.contains("what are you doing on 17th may")) {
            return "There is a conference on Cloud Native by Thinknyx Technologies, I will be there.<br><br>";
        } else if (message.contains("who are the speakers")) {
            return "There are 4 speakers.<br><br>";
        } else if (message.contains("name the speakers") || message.equals("speakers") || message.contains("speakers")) {
            return "Kulbhushan Mayer, Dheeraj Sain, Deepthi Narayan, Yogesh Raheja, and Kumar Kanishk.<br><br>";
        } else {
            return "Sorry, I didn’t understand that. For further queries, visit https://tsa.thinknyx.com or call us at +91 9717917973.<br><br>";
        }
    }
}
