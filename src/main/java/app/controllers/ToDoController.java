package app.controllers;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.entities.ToDo;
import app.repositories.ToDoRepository;

@CrossOrigin
@RestController
public class ToDoController {

	@Resource
	private ToDoRepository toDoRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> create() {

		// final int toDosCreadas = 100;
		//
		// for (int i = 0; i < toDosCreadas; i++) {
		//
		// this.toDoRepository.save(new ToDo());
		// }
		//
		// return new ResponseEntity<>(toDosCreadas + " tareas creadas",
		// HttpStatus.OK);

		return new ResponseEntity<>("Hola mundo", HttpStatus.OK);
	}

	@RequestMapping(value = "/todo", method = RequestMethod.GET)
	public ResponseEntity<Page<ToDo>> getAll(@RequestParam(value = "page", required = false, defaultValue = "0") final int page,
	        @RequestParam(value = "size", required = false, defaultValue = "100") final int size,
	        @RequestParam(value = "name", required = false, defaultValue = "") final String name) {

		// if ("".equals(name)) {
		//
		// final Page<ToDo> result = this.toDoRepository.findAll(new
		// PageRequest(page, size, new Sort(Sort.Direction.ASC, "name")));
		// return new ResponseEntity<>(result, HttpStatus.OK);
		// }
		//
		// final Page<ToDo> result = this.toDoRepository.findByName(name, new
		// PageRequest(page, size, new Sort(Sort.Direction.ASC, "name")));
		// return new ResponseEntity<>(result, HttpStatus.OK);
		return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
	}

	@RequestMapping(value = "/todo", method = RequestMethod.POST)
	public ResponseEntity<ToDo> create(@RequestBody final ToDo toDo) {

		// final ToDo result = this.toDoRepository.save(toDo);
		//
		// return new ResponseEntity<>(result, HttpStatus.OK);
		return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	public ResponseEntity<ToDo> get(@PathVariable final Long id) {

		// final ToDo result = this.toDoRepository.findOne(id);
		//
		// if (result == null) {
		//
		// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		// }
		//
		// return new ResponseEntity<>(result, HttpStatus.OK);
		return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ToDo> update(@PathVariable final Long id, @RequestBody final ToDo toDo) {

		// final ToDo result = this.toDoRepository.findOne(id);
		//
		// if (result == null) {
		//
		// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		// }
		//
		// result.setName(toDo.getName());
		//
		// this.toDoRepository.save(result);
		//
		// return new ResponseEntity<>(result, HttpStatus.OK);
		return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<ToDo> delete(@PathVariable final Long id) {

		// final ToDo result = this.toDoRepository.findOne(id);
		//
		// if (result == null) {
		//
		// return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		// }
		//
		// this.toDoRepository.delete(result);
		//
		// return new ResponseEntity<>(result, HttpStatus.OK);
		return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
	}
}
