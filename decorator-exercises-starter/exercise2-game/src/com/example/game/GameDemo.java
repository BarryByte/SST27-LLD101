package com.example.game;

public class GameDemo {
    public static void main(String[] args) {
        Character base = new BaseCharacter();

        System.out.println("--- Base ---");
        base.move();
        base.attack();

        // Base + Speed + Damage
        Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
        System.out.println("\n--- Buffed (Speed+Damage) ---");
        buffed.move();
        buffed.attack();

        // Add GoldenAura
        Character shiny = new GoldenAura(buffed);
        System.out.println("\n--- Buffed + GoldenAura ---");
        shiny.move();
        shiny.attack();

        // Remove GoldenAura (recompose without it)
        Character withoutAura = buffed;
        System.out.println("\n--- Buffed (no aura) ---");
        withoutAura.move();
        withoutAura.attack();
    }
}
