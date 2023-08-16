package dev.ejiwen.todolist;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class TodoListController {

    List<Note> myNotes = new ArrayList<>();

    @GetMapping("/notes")
    public String getNotes(Model model) {
        myNotes.add(new Note("Java", "Learn java Spring boot"));
        myNotes.add(new Note("JavaScript", "Learn javaScript"));
        myNotes.add(new Note("PHP", "Learn PHP"));
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
