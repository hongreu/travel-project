package hongreu.demo.dto;

import java.util.List;

public class PlaceListResponseDto extends ResponseBaseDto {
	private List<PlacesData> placesData;
	
	public List<PlacesData> getPlacesData() {
		return placesData;
	}
	public void setPlacesData(List<PlacesData> placesData) {
		this.placesData = placesData;
	}
}
