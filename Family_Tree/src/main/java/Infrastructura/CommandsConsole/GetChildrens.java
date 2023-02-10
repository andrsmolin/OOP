package Infrastructura.CommandsConsole;

import MVP.View;

public class GetChildrens<E> implements TreeOptions {

    View view;

    public GetChildrens(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Показать детей";
    }

    @Override
    public void execute() {
        view.getChildrens();
    }

}
