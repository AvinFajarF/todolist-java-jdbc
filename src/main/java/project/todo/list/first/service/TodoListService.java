package project.todo.list.first.service;

import project.todo.list.first.entity.TodoList;

import java.util.List;
import java.util.Optional;

public interface TodoListService {

//    TODO: mendapatkan semua todo
//    TODO: menyimpan todo
//    TODO: menampilkan detail todo
//    TODO: update todo
//    TODO: hapus todo

    public List<TodoList> getTodoAll();

    public void saveTodo(TodoList todoList);

    public Optional<TodoList> getTodoById(Long id);

    public void updateTodo(Long id, String todo);

    public void deleteTodo(Long id);

}
