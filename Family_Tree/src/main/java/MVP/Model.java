package MVP;

import Infrastructura.Members.Human;
import Infrastructura.Members.Members;
import Infrastructura.Tree.Tree;

import java.util.List;

public class Model<E extends Members> {

    Presenter presenter;

    public Model(Presenter presenter) {

        this.presenter = presenter;
    }

    public void getTree(Tree tree) {
        presenter.showTree(tree.iterator());
    }

    public void getChildrens(Tree tree, String surname, String name) {
        int i = tree.findHumanIndx(surname, name);
        if (i >= 0) {
            List<E> chil = tree.getMember(i).children;
            presenter.showChildren(chil);
        } else {
            presenter.notFound();
        }
    }

    public void addHumanEnter(Tree tree, String surname, String name, int yearBorn, int yearDead, String sex) {

        tree.addHuman(new Human(surname, name, yearBorn, yearDead, null, null, null, sex));
        getTree(tree);
    }

    public void sortBySurname(Tree tree) {

        tree.sortBySurname();
        presenter.showTree(tree.iterator());

    }

    public void sortByDate(Tree tree) {
        tree.sortByDate();
        presenter.showTree(tree.iterator());

    }
}
