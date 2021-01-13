package test.service;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        //testShowTodoList();
        //testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Olah Raga");
        todoListService.addTodoList("Sarapan");
        todoListService.addTodoList("Baca Koran");
        todoListService.addTodoList("Persiapan Kerja");

        todoListService.showTodoList();
    }

    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Olah Raga");
        todoListService.addTodoList("Sarapan");
        todoListService.addTodoList("Baca Koran");
        todoListService.addTodoList("Persiapan Kerja");

        todoListService.showTodoList();
        todoListService.removeTodoList(6);// failure
        todoListService.removeTodoList(3);// success

        todoListService.showTodoList();
    }
}
