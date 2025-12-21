package com.cool.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "Learn Java", "Learn Java", false, LocalDate.now().plusYears(1)));
        todos.add(new Todo(2, "Learn Spring", "Learn Spring", false, LocalDate.now().plusYears(2)));
        todos.add(new Todo(3, "Learn Spring Boot", "Learn Spring Boot", false, LocalDate.now().plusYears(3)));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

}
