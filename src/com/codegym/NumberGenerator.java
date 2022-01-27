package com.codegym;

public class NumberGenerator implements Runnable{
    private String name;

    public NumberGenerator() {
    }

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int hashCode = this.hashCode();
        for (int i = 0; i < 10; i++) {
            String result = "[" + this.name + " hashCode=" + hashCode + "]";
            result += "  i=" + i;
            System.out.println(result);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
