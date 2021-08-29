package com.navigation;

public class Notification {
    public Notification() {
        final String how_are_you = "how are you";
        getPrintln(how_are_you);
    }

    private void getPrintln(String how_are_you) {
        System.out.println(getHow_are_you(how_are_you));
    }

    private String getHow_are_you(String how_are_you) {
        return how_are_you;
    }
}
