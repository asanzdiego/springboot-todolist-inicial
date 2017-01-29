package app.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import app.entities.ToDo;

public interface ToDoRepository extends PagingAndSortingRepository<ToDo, Long> {

	// @Query("select t from ToDo t where t.name like %:name%")
	// Page<ToDo> findByName(@Param("name") String name, Pageable pageable);

}