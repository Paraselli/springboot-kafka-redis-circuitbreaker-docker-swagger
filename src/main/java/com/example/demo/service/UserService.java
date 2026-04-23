@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repo;

    @CircuitBreaker(name = "userService", fallbackMethod = "fallback")
    public List<User> getUsers() {
        return repo.findAll();
    }

    public List<User> fallback(Exception e) {
        return List.of(new User());
    }
}
