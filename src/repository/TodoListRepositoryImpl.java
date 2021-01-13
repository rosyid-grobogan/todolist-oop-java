package repository;

import entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository{

    private TodoList[] data = new TodoList[10];

    @Override
    public TodoList[] getAll() {
        return data;
    }

    @Override
    public void add(TodoList todoList) {
        resizeIfFull();

        for (int i = 0; i < data.length; i++){
            if (data[i] == null){
                data[i] = todoList;
                break;
            }
        }
    }

    @Override
    public boolean remove(Integer number) {
        if ((number - 1) >= data.length){
            return false;
        }else if (data[number - 1] == null){
            return false;
        } else {
            for (int i = (number - 2); i < data.length; i++){
                if (i == (data.length - 1)){
                    data[i] = null;
                }else {
                    data[i] = data[i + 1];
                }
            }

            return true;
        }
    }

    public boolean isFull(){

        boolean isFull = true;
        for (int i = 0; i < data.length; i++){
            if (data[i] == null){
                // index masih ada yang kosong
                isFull = false;
                break;
            }
        }

        return isFull;
    }

    public void resizeIfFull(){
        if (isFull()){
            TodoList[] temp = data;
            data = new TodoList[data.length * 2];

            for (int i = 0; i < temp.length; i++){
                data[i] = temp[i];
            }
        }
    }
}
