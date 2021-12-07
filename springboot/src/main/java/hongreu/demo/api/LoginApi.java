package hongreu.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hongreu.demo.dto.LoginRequestDto;
import hongreu.demo.dto.LoginResponseDto;
import hongreu.demo.service.ILoginService;

//@Controller
@CrossOrigin
@RestController // = @Controller + @ResponseBody
public class LoginApi{
	@Autowired
	private ILoginService loginService;
	
	//@RequestMapping(value = "/news", method = RequestMethod.POST)
	//@ResponseBody
	@PostMapping(value = "/login") // = @RequestMapping + method
	public LoginResponseDto login(@RequestBody LoginRequestDto loginRequestDto) {
		return loginService.checkUser(loginRequestDto);
	}
}