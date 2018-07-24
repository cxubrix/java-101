package lv.rigacoding.todo;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/todo")
@RestController
public class ToDoController {

	private ToDoManager manager;

	public ToDoController() {
		manager = ToDoManagerImpl.getInstance();
		manager.add("Learn some C# programming", true);
		manager.add("Master Java programming", true);
		manager.add("Get proficient in HTML, CSS and JS ", false);
	}

	@RequestMapping(path = "/all", method = RequestMethod.GET)
	public List<ToDo> all() {
		return manager.getAll();
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public ToDo byId(@PathVariable("id") Long id) {
		return manager.getById(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Long add(@RequestBody ToDo todo) {
		String content = todo.getContent();
		boolean done = todo.isDone();
		return manager.add(content, done);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PATCH)
	public void update(@PathVariable("id") Long id, @RequestBody ToDo todo) {
		String content = todo.getContent();
		boolean done = todo.isDone();
		manager.update(id, content, done);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void remove(@PathVariable("id") Long id) {
		manager.remove(id);
	}

}
