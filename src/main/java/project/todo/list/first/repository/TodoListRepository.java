package project.todo.list.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.todo.list.first.entity.TodoList;

public interface TodoListRepository extends JpaRepository<TodoList, Long> {
}
