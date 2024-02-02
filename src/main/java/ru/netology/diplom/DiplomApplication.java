package ru.netology.diplom;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.diplom.jwt.JwtTokenUtil;
import ru.netology.diplom.repository.UserRepository;

import java.sql.SQLException;

@RestController
@SpringBootApplication
public class DiplomApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiplomApplication.class, args);
    }

    @PostMapping("/login")
    public JSONObject getAuthorities(@RequestParam("login") String login) throws SQLException {
        JSONObject json = new JSONObject();
        JwtTokenUtil jwtTokenUtil = new JwtTokenUtil();
        UserRepository userRepository = new UserRepository();
        json.put("auth-token", jwtTokenUtil.generateToken(userRepository.findByUsername(login)));
        return json;
    }

}
