package MVP;

import java.util.Iterator;
import java.util.List;

import Infrastructura.Tree.Tree;

public class Presenter {
    View view;
    Model model = new Model<>(this);

    public Presenter(View view) {
        this.view = view;
    }

    public void getTree(Tree tree) {

        model.getTree(tree);
    }

    public void getChildrens(Tree tree, String surname, String name) {

        model.getChildrens(tree, surname, name);
    }

    public void addHumanEnter(Tree tree, String surname, String name, int yearBorn, int yearDead, String sex) {

        model.addHumanEnter(tree, surname, name, yearBorn, yearDead, sex);
    }

    public void sortBySurname(Tree tree) {

        model.sortBySurname(tree);
    }

    public void sortByYear(Tree tree) {

        model.sortByDate(tree);
    }

    public void showTree(Iterator iterator) {
        view.showTree(iterator);
    }

    public <E> void showChildren(List<E> chil) {
        view.showChildren(chil);
    }

    public void notFound() {
        view.notFound();
    }

}
