package model;

import java.io.Serializable;

public class UserProfile implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String userId;
		private String firstName;
		private String lastName;
		private String jobRoleCode;
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getJobRoleCode() {
			return jobRoleCode;
		}
		public void setJobRoleCode(String jobRoleCode) {
			this.jobRoleCode = jobRoleCode;
		}
}
