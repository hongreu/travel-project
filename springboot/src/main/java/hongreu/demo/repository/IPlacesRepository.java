package hongreu.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hongreu.demo.entity.PlacesEntity;

public interface IPlacesRepository extends JpaRepository<PlacesEntity, Long> {
	List<PlacesEntity> findAll();
}
