//package ru.netology.diplom;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.provisioning.UserDetailsManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//public class SecurityConfiguration {
//    private final DataSource dataSource;
//
//
//    public SecurityConfiguration(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Bean
//    public BCryptPasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery("select login, password, 'true' from users" +
//                        "where login=?")
//                .authoritiesByUsernameQuery("select login, authority from users " +
//                        "where login=?");
//    }
//
//    @Bean
//    public UserDetailsManager users(DataSource dataSource) {
//        UserDetails user = User;
//        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//        users.;
//        return users;
//    }
//}
