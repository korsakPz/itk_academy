package com.yourpackage.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class UndoableStringBuilder {


    private StringBuilder stringBuilder;
    private List<Memento> history;
    private int currentState;

    public UndoableStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.history = new ArrayList<>();
        this.currentState = -1;
        saveState(); // сохраняем начальное состояние
    }

    // Memento - внутренний класс для хранения состояния
    private static class Memento {
        private final String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }

    // Сохраняем текущее состояние
    private void saveState() {
        // Удаляем все состояния после текущего (если делали undo)
        if (currentState < history.size() - 1) {
            history.subList(currentState + 1, history.size()).clear();
        }

        history.add(new Memento(stringBuilder.toString()));
        currentState = history.size() - 1;

        // Ограничиваем историю (чтобы не росла бесконечно)
        if (history.size() > 100) {
            history.remove(0);
            currentState--;
        }
    }

    // Основные методы StringBuilder с сохранением состояния

    public UndoableStringBuilder append(String str) {
        stringBuilder.append(str);
        saveState();
        return this;
    }

    public UndoableStringBuilder insert(int offset, String str) {
        stringBuilder.insert(offset, str);
        saveState();
        return this;
    }

    public UndoableStringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        saveState();
        return this;
    }

    public UndoableStringBuilder reverse() {
        stringBuilder.reverse();
        saveState();
        return this;
    }

    // Метод отмены - возвращает к предыдущему состоянию
    public boolean undo() {
        if (currentState > 0) {
            currentState--;
            stringBuilder = new StringBuilder(history.get(currentState).getState());
            return true;
        }
        return false; // нельзя отменить дальше
    }

    // Метод повтора (дополнительно)
    public boolean redo() {
        if (currentState < history.size() - 1) {
            currentState++;
            stringBuilder = new StringBuilder(history.get(currentState).getState());
            return true;
        }
        return false; // нельзя повторить дальше
    }

    // Вспомогательные методы для получения текущего состояния

    @Override
    public String toString() {
        return stringBuilder.toString();
    }

    public int length() {
        return stringBuilder.length();
    }

    // Метод для получения информации о состоянии истории (для отладки)
    public String getHistoryInfo() {
        return String.format("History size: %d, Current state: %d",
                history.size(), currentState);
    }

}
