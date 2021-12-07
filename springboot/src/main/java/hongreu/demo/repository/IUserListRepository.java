package hongreu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hongreu.demo.entity.UserListEntity;

public interface IUserListRepository extends JpaRepository<UserListEntity, String> {
	UserListEntity findOneByUsername(String username);
	UserListEntity findOneByToken(String token);
}
