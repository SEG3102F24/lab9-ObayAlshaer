package seg3x02.tempconverterapi

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.beans.factory.annotation.Autowired

@Configuration
class UsersSetup {

    @Autowired
    fun configureGlobal(auth: AuthenticationManagerBuilder, encoder: PasswordEncoder) {
        auth.inMemoryAuthentication()
            .withUser("testuser")
            .password(encoder.encode("password"))
            .roles("READ")
    }
}
