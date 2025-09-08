package com.example.notifications;

public abstract class NotifierDecorator implements Notifier {
    protected final Notifier wrappee;  // the wrapped notifier

    public NotifierDecorator(Notifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void notify(String text) {
        // First, delegate to the wrapped notifier
        wrappee.notify(text);
    }
}
