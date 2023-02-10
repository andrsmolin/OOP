package MVP;

import Infrastructura.CommandsConsole.*;
import Infrastructura.Tree.Tree;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class View {

    CommandList cl = new CommandList<>();

    Tree tree;

    Presenter presenter = new Presenter(this);

    public View(Tree tree) {
        this.tree = tree;
    }

    public void start() {
        System.out.println("Выберите команду для работы с семейным деревом: \n");

        cl.addCommand(new GetTree<>(this));
        cl.addCommand(new GetChildrens<>(this));
        cl.addCommand(new AddHuman<>(this));
        cl.addCommand(new SortByName<>(this));
        cl.addCommand(new SortByYear<>(this));

        for (int index = 0; index < cl.size(); index++) {
            System.out.println(index + 1 + ": " + cl.getCommand(index).discription());
        }

        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        cl.getCommand(choose - 1).execute();
    }

    public void getTree() {

        presenter.getTree(tree);
    }

    public void getChildrens() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Фамилию: \n");
        String surname = scanner.next();

        System.out.println("Введите Имя: \n");
        String name = scanner.next();

        presenter.getChildrens(tree, surname, name);
    }

    public void addHuman() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите Фамилию: \n");
        String surname = scanner.next();

        System.out.println("Введите Имя: \n");
        String name = scanner.next();

        System.out.println("Введите год рождения: \n");
        int yearBorn = scanner.nextInt();

        System.out.println("Введите год смерти: \n");
        int yearDead = scanner.nextInt();

        System.out.println("Введите пол: \n");
        String sex = scanner.next();

        presenter.addHumanEnter(tree, surname, name, yearBorn, yearDead, sex);
    }

    public void sortByName() {

        presenter.sortBySurname(tree);
    }

    public void sortByYear() {

        presenter.sortByYear(tree);
    }

    public void showTree(Iterator iterator) {
        for (Object human : tree) {
            System.out.println(human);
        }
    }

    public <E> void showChildren(List<E> chil) {
        if (chil.size() > 0) {
            for (int index = 0; index < chil.size(); index++) {
                System.out.println(chil.get(index) + "\n");
            }
        } else {
            System.out.println("У него нет детей");
        }
    }

    public void notFound() {
        System.out.println("Человек не найден");
    }

}