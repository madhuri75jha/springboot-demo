package com.example.chatbot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChatbotController {

    @Autowired
    private ChatbotService chatbotService;

    @GetMapping("/")
    public String home() {
        return "chat"; // Loads templates/chat.html
    }

    @PostMapping("/chat")
    public String chat(@RequestParam("message") String message, Model model) {
        String response = chatbotService.getResponse(message);
        model.addAttribute("userMessage", message);
        model.addAttribute("botResponse", response);
        return "chat"; // Re-render the same page with updated model
    }
}
