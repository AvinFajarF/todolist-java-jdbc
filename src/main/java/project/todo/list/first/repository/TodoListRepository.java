package project.todo.list.first.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.todo.list.first.entity.TodoList;

@Repository
public interface TodoListRepository extends JpaRepository<TodoList, Long> {
}
