package fiap.com.br.watchlistapi.security;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AuthController {

    public record TokenResponse(String token) {}
    public record LoginRequest(String username, String password) {}

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/login")
    public TokenResponse token(@RequestBody LoginRequest request) {
        log.info("Generating token for user 'joao'");
        return new TokenResponse(tokenService.generateToken(request.username));
    }

}