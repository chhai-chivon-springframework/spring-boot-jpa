package com.wordpress.chhaichivon.repository.user;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 7/25/2017
 * TIME   : 3:03 PM
 */
/*
@Component
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(s);
        if (user == null) {
            throw new UsernameNotFoundException(s + " was not found !!!");
        }
        Set<Role> roles = user.getRoles();
        String[] stringRole = {};
        int i = 0;
        for (Role role : roles) {
            stringRole[i] = role.getName();
            i++;
        }
        return new org.springframework.security.core.userdetails.User(
                user.getUserName(),
                user.getPassword(),
                AuthorityUtils.createAuthorityList(stringRole)
        );
    }
}
*/
