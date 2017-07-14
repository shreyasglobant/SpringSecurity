package config;

import model.UserProfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import properties.RoleProperties;

@Component(value = "reqInterceptor")
public class RequestInterceptor{
	@Autowired
	private RoleProperties properties;
	
	public boolean isAdmin() {
		System.out.println("In is admin.");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		UserProfile currentUser = (UserProfile)authentication.getPrincipal();
		
		return properties.getAdminroles().stream().anyMatch(ur->ur.equalsIgnoreCase(currentUser.getJobRoleCode()));
	}
	
	public boolean isUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		UserProfile currentUser = (UserProfile)authentication.getPrincipal();
		
		return properties.getUserroles().stream().anyMatch(ur->ur.equalsIgnoreCase(currentUser.getJobRoleCode()));
	}

	public boolean isUserOrAdmin() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		UserProfile currentUser = (UserProfile)authentication.getPrincipal();
		
		return (properties.getUserroles().stream().anyMatch(ur->ur.equalsIgnoreCase(currentUser.getJobRoleCode())) ||			
		properties.getAdminroles().stream().anyMatch(ur->ur.equalsIgnoreCase(currentUser.getJobRoleCode())));
		
	}
}
