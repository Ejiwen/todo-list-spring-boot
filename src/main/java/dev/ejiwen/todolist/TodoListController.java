package dev.ejiwen.todolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class TodoListController {

    List<Note> myNotes = Arrays.asList(
            new Note("Java", "Learn java Spring boot"),
            new Note("JavaScript", "Learn javaScript"),
            new Note("PHP", "Learn PHP"));

    @GetMapping("/notes")
    public String getNotes(Model model) {
        model.addAttribute("notes", myNotes);
        return "notes";
    }

    @GetMapping("/messages")
    public String getMessages(Model model) {
        AdminMessage message = new AdminMessage(true, "Hi everybody ...");
        model.addAttribute("message", message);
        return "messages";
    }

}
