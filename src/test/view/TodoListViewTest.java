package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
        //testShowTodoList();
        //testAddTodoList();
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Olah Raga");
        todoListService.addTodoList("Sarapan");
        todoListService.addTodoList("Kerja");

        todoListView.showTodoList();
    }
    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Olah Raga");
        todoListService.addTodoList("Sarapan");
        todoListService.addTodoList("Kerja");

        todoListView.addTodoList();
        todoListService.showTodoList();
    }
    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Olah Raga");
        todoListService.addTodoList("Sarapan");
        todoListService.addTodoList("Kerja");

        todoListService.showTodoList();
        todoListView.deleteTodoList();
        todoListService.showTodoList();
    }
}
