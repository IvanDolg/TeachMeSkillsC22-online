import java.util.List;

public interface UserStorage {
    void save(User user);
    List<String> findAll();
}
