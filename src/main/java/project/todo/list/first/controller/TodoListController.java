package project.todo.list.first.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.todo.list.first.entity.TodoList;
import project.todo.list.first.service.TodoListService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/todo")
public class TodoListController {

    private final TodoListService todoListService;

    @Autowired
    public TodoListController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping
    public List<TodoList> getTodoAll(){
        return todoListService.getTodoAll();
    }

    @PostMapping
    public void saveTodo(@RequestBody TodoList todo){
        todoListService.saveTodo(todo);
    }

    @GetMapping(path = "{idTodo}")
    public Optional<TodoList> getTodoById(@PathVariable("idTodo") Long id){
        return todoListService.getTodoById(id);
    }

    @DeleteMapping(path = "{idTodo}" )
    public void deleteTodoById(@PathVariable("idTodo") Long id){
        todoListService.deleteTodo(id);
    }

    @PutMapping(path = "{idTodo}")
    public void updateTodo(@PathVariable("idTodo") Long id, @RequestBody(required = true) String todo){
         todoListService.updateTodo(id, todo);
    }
}
