package cl.roisel.apps.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.roisel.apps.apirest.models.dao.IUserDao;
import cl.roisel.apps.apirest.models.entity.User;

@Service
@Primary
public class UserApplicationService implements UserDetailsService {

  private Logger logger = LoggerFactory.getLogger(UserApplicationService.class);

  private final IUserDao userDao;

  @Autowired
  public UserApplicationService(IUserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  @Transactional(readOnly = true)
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userDao.findByUsername(username);
    if (user == null) {
      logger.error("Error en el login: Usuario no existe");
      throw new UsernameNotFoundException("Error en el loggin: no existe el usuario");
    }
    List<GrantedAuthority> authorities =
        user.getRoles().stream()
            .map(role -> new SimpleGrantedAuthority(role.getName()))
            .peek(authority -> logger.info("Role: " + authority.getAuthority()))
            .collect(Collectors.toList());
    return new org.springframework.security.core.userdetails.User(
        username, user.getPassword(), user.getEnabled(), true, true, true, authorities);
  }
}
