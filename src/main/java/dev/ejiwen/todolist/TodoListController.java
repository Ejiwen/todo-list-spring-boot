package dev.ejiwen.todolist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class TodoListController {

    List<Note> myNotes = new ArrayList<>();

    @PostMapping("/handleSubmit")
    public String submitNote(Note note) {
        myNotes.add(note);
        return "redirect:/notes";
    }

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

    @GetMapping("/new-note")
    public String newNote(Model model) {
        model.addAttribute("note", new Note());
        return "form";
    }

}
