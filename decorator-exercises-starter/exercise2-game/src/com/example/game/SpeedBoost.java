package com.example.game;

public class SpeedBoost extends CharacterDecorator {
    private final int bonus;

    public SpeedBoost(Character wrappee, int bonus) {
        super(wrappee);
        this.bonus = bonus;
    }

    @Override
    public void move() {
        System.out.println("Moving faster! Speed = " + getSpeed() + " with sprite " + getSprite());
    }

    @Override
    public int getSpeed() {
        return super.getSpeed() + bonus;
    }
}
