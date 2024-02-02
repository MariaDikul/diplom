//package ru.netology.diplom;
//
//import org.json.JSONObject;
//
//import java.math.BigInteger;
//import java.security.SecureRandom;
//
//public class TokenService {
//    private String token;
//    private UserRepository userRepository;
//
//    public TokenService(String login) {
//        generateToken();
//        saveToken(token, login);
//    }
//
//    private void generateToken() {
//        byte[] bytes = new byte[32];
//        new SecureRandom().nextBytes(bytes);
//        token = new BigInteger(1, bytes).toString(16);
//    }
//
//    private void saveToken(String token, String login) {
//        userRepository.setToken(token, login);
//    }
//
//    public JSONObject getJson() {
//        JSONObject json = new JSONObject();
//        json.put("auth-token", token);
//        return json;
//    }
//
//}
