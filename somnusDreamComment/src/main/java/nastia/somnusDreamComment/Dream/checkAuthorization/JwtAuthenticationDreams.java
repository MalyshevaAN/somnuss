package nastia.somnusDreamComment.Dream.checkAuthorization;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
 //change cause it is in different microservice


import java.util.Collection;
import java.util.Set;

@Getter
@Setter
public class JwtAuthenticationDreams implements Authentication {

    private Long id;
    private boolean authenticated;
    private String username;
    private String firstName;
    private String authorUserName;
    private Set<Role> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() { return roles; }

    @Override
    public Long getCredentials() { return id; }

    @Override
    public Object getDetails() { return null; }

    @Override
    public Object getPrincipal() { return username; }

    @Override
    public boolean isAuthenticated() { return authenticated; }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        this.authenticated = isAuthenticated;
    }

    @Override
    public String getName() { return firstName; }

}