package hongreu.demo.dto;

public class PlaceListRequestDto extends BaseDto<PlaceListRequestDto>{
	private String token;
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
}
