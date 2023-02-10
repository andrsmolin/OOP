package Infrastructura.CommandsConsole;

import MVP.View;

public class GetTree<E> implements TreeOptions {

    View view;

    public GetTree(View view) {
        this.view = view;
    }

    @Override
    public String discription() {
        return "Вывести дерево";
    }

    @Override
    public void execute() {
        view.getTree();
    }

}
