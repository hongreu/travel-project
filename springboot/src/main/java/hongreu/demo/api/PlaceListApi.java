package hongreu.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hongreu.demo.dto.PlaceListRequestDto;
import hongreu.demo.dto.PlaceListResponseDto;
import hongreu.demo.service.IPlaceListService;

//@Controller
@CrossOrigin
@RestController // = @Controller + @ResponseBody
public class PlaceListApi{
	@Autowired
	private IPlaceListService placeListService;
	
	//@RequestMapping(value = "/news", method = RequestMethod.POST)
	//@ResponseBody
	@PostMapping(value = "/place-inqury") // = @RequestMapping + method
	public PlaceListResponseDto placeInquiry(@RequestBody PlaceListRequestDto placeListRequestDto) {
		return placeListService.findAllPlaces(placeListRequestDto);
	}
}