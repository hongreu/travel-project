package hongreu.demo.service;

import hongreu.demo.dto.LoginRequestDto;
import hongreu.demo.dto.LoginResponseDto;

public interface ILoginService {
	LoginResponseDto checkUser(LoginRequestDto loginRequestDto);
}
