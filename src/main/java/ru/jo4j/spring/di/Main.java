package ru.jo4j.spring.di;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(ConsoleInput.class);
        context.reg(Store.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
    }

}