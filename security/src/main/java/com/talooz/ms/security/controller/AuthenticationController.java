package com.talooz.ms.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.talooz.ms.security.auth.JwtAuthenticationResponse;
import com.talooz.ms.security.auth.JwtTokenUtil;
import com.talooz.ms.security.dao.UserRepository;
import com.talooz.ms.security.model.ApplicationUser;

@RestController
public class AuthenticationController {

	@Value("${jwt.header}")
    private String tokenHeader;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;
    
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "${jwt.route.authentication.path}", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody ApplicationUser user) throws AuthenticationException {

        // Perform the security
		final Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Reload password post-security so we can generate token
        final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUsername());
        
        final String token = jwtTokenUtil.generateToken(userDetails);
        ApplicationUser applicationUser = userRepository.findByUsername(user.getUsername());
        // Return the token
        return ResponseEntity.ok(new JwtAuthenticationResponse(token,applicationUser.getUsername(),applicationUser.getUserId(),applicationUser.getFirstName(),applicationUser.getLastName(),null,null,null,applicationUser.getProfileComplete()));
    }
}
