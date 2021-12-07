package hongreu.demo.service;

import hongreu.demo.dto.PlaceListRequestDto;
import hongreu.demo.dto.PlaceListResponseDto;

public interface IPlaceListService {
	PlaceListResponseDto findAllPlaces(PlaceListRequestDto placeListRequestDto);
}
