package hongreu.demo.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hongreu.demo.dto.PlacesData;
import hongreu.demo.entity.PlacesEntity;

@Component
public class PlacesConverter {
	
	public List<PlacesData> toDto(List<PlacesEntity> placesEntity) {
		List<PlacesData> placesData = new ArrayList<PlacesData>();
		for(PlacesEntity placeEntity : placesEntity) {
			PlacesData placeData = new PlacesData();
			placeData.setName(placeEntity.getName());
			placeData.setVisited(placeEntity.getVisited());
			placesData.add(placeData);
		}
		return placesData;
	}
}
