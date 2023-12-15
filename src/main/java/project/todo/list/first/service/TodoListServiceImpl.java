package project.todo.list.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.todo.list.first.entity.TodoList;
import project.todo.list.first.repository.TodoListRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TodoListServiceImpl implements TodoListService{
//    TODO: implementasi mendapatkan semua todo
//    TODO: implementasi menyimpan todo
//    TODO: implementasi menampilkan detail todo
//    TODO: implementasi update todo
//    TODO: implementasi hapus todo

    private final TodoListRepository todoListRepository;

    @Autowired
    public TodoListServiceImpl(TodoListRepository repository) {
        this.todoListRepository = repository;
    }

    @Override
    public List<TodoList> getTodoAll() {
        return todoListRepository.findAll();
    }

    @Override
    public void saveTodo(TodoList todoList) {
    todoListRepository.save(todoList);
    }

    @Override
    public Optional<TodoList> getTodoById(Long id) {
        return todoListRepository.findById(id);
    }

    @Override
    public void updateTodo(Long id, String todo) {
        TodoList todoList = todoListRepository
                .findById(id)
                .orElseThrow(() -> new IllegalStateException("Todo list tidak di temukan"));
//        check jika ada request todo
        if (todo != null && !todo.isEmpty()){
            todoList.setTodo(todo);
        }
    }

    @Override
    public void deleteTodo(Long id) {
    Optional<TodoList> todoList = todoListRepository.findById(id);
//    check data ada di database atau tidak
        if (todoList.isPresent()){
            todoListRepository.deleteById(id);
        }
    }

}
