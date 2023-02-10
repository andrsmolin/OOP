package Infrastructura.CommandsConsole;

import MVP.View;

public class SortByYear<E> implements TreeOptions {

    View view;

    public SortByYear(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Cортировка по году";
    }

    @Override
    public void execute() {
        view.sortByYear();
    }

}
