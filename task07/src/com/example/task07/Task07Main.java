package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
        Task07Main task = new Task07Main();
        task.processor = new Processor();
        String result = task.getExceptionType();
        System.out.println("Exception type: " + result);
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();

        } catch (RuntimeException exception) {
            return UNCHECKED;

        } catch (Exception exception) {
            return CHECKED;

        }
        return NONE;
    }

}