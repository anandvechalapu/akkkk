·       Successful logout should be confirmed.
·       After logout user should be redirected to the login page.

Controller Class:

@RestController
public class LogoutController {
	
    @Autowired
    private LogoutService logoutService;
	
    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        logoutService.logout();
        return ResponseEntity.ok("User logged out successfully");
    }
}

Service Class:

@Service
public class LogoutService {

    @Autowired
    private LogoutRepository logoutRepository;

    public void logout() {
        logoutRepository.logout();
    }
}

Repository Class:

@Repository
public class LogoutRepository {

    public void logout() {
        // Database logic to log out the user
    }
}