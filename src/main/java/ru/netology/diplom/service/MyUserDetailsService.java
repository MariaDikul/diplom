package ru.netology.diplom.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.netology.diplom.repository.User;
import ru.netology.diplom.repository.UserRepository;

import java.sql.SQLException;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public MyUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user;
        try {
            user = userRepository.findByUsername(username);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }
}
