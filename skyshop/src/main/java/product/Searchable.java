package product;
import java.util.UUID;
public interface Searchable {
    UUID getId();

    boolean matches(String pattern);
}

