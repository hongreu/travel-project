package hongreu.demo.dto;

public class LoginResponseDto extends ResponseBaseDto{
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
