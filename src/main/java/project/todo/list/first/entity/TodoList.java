package project.todo.list.first.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "todo")
public class TodoList {

    @Id
    @SequenceGenerator(
            name = "todo_sequance",
            sequenceName =  "todo_sequance",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "todo_sequance"
    )    private Long id;

    public TodoList(String todo) {
        this.todo = todo;
    }

    @Column(name = "todo")
    private String todo;

    public TodoList() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    @Override
    public String toString() {
        return "TodoList{" +
                "id=" + id +
                ", todo='" + todo + '\'' +
                '}';
    }
}
