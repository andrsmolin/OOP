package Infrastructura.CommandsConsole;

import MVP.View;

public class SortByName<E> implements TreeOptions {

    View view;

    public SortByName(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Сортировка по имени";
    }

    @Override
    public void execute() {
        view.sortByName();
    }

}
