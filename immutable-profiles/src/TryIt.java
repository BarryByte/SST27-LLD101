import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");

        System.out.println("Before: " + p.getEmail());

        // This line no longer compiles because setters are gone:
        // p.setEmail("evil@example.com");

        // Instead, changes require building a new object:
        UserProfile p2 = svc.withDisplayName(p, "Cool User");

        System.out.println("After:  " + p2.getDisplayName());
        System.out.println("Original unchanged: " + p.getDisplayName());
    }
}
