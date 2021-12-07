package hongreu.demo.dto;

public abstract class ResponseBaseDto extends BaseDto<ResponseBaseDto> {
	private String responseCode;
	private String description;
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
