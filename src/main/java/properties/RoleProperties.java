package properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("roles")
public class RoleProperties {
	private final List<String> userroles = new ArrayList<>();
	private final List<String> adminroles = new ArrayList<>();
	public List<String> getUserroles() {
		return userroles;
	}
	public List<String> getAdminroles() {
		return adminroles;
	}
}
