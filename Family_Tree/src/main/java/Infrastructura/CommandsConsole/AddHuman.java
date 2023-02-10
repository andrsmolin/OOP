package Infrastructura.CommandsConsole;

import MVP.View;

public class AddHuman<E> implements TreeOptions {
    View view;

    public AddHuman(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Добавить человека";
    }

    @Override
    public void execute() {
        view.addHuman();
    }

}
