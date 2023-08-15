package dev.ejiwen.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;

@Controller
public class TodoListController {

    @GetMapping(value = "/notes")
    public String getNotes(Model model) {
        Note note = new Note("Java", "Leaern java Spring boot");
        model.addAttribute("note", note);
        return "notes";
    }

}
