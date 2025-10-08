package com.yourpackage.patterns.memento;

public class Main {

    public static void main(String[] args) {
        UndoableStringBuilder usb = new UndoableStringBuilder();

        usb.append("Hello");
        System.out.println("After append: " + usb); // Hello

        usb.append(" World");
        System.out.println("After append: " + usb); // Hello World

        usb.insert(5, ",");
        System.out.println("After insert: " + usb); // Hello, World

        usb.undo();
        System.out.println("After undo: " + usb); // Hello World

        usb.undo();
        System.out.println("After undo: " + usb); // Hello

        usb.append(" Again");
        System.out.println("After append: " + usb); // Hello Again

        // Показываем, что redo не работает после нового действия
        usb.redo();
        System.out.println("After redo: " + usb); // Hello Again (не изменилось)

        System.out.println(usb.getHistoryInfo());
    }
}
