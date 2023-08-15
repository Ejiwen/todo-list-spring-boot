package dev.ejiwen.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class TodoListController {

    @GetMapping(value = "/notes")
    public String getNotes(Model model) {
        return "notes";
    }

}
