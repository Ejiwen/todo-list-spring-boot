package dev.ejiwen.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoListController {

    @GetMapping(value = "/hello")
    public String handle() {
        return "page1";
    }

}
