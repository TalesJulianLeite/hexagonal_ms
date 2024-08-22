package com.leite.tales.default_hexagonal.application.security.authentication;

import com.leite.tales.default_hexagonal.adapters.out.persistence.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AuthService authService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity usuario = authService.buscarPorNome(username);
		if (usuario != null) {
			return User.withUsername(usuario.getNome())
					.password(usuario.getSenha())
					.authorities("ROLE_USER")
					.build();
		} else {
			throw new UsernameNotFoundException("Usuário não encontrado: " + username);
		}
	}
}