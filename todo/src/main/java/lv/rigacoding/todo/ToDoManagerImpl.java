package lv.rigacoding.todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ToDoManagerImpl implements ToDoManager {

	// single instance of ToDoManagerImpl
	private static ToDoManager instance;

	private final HashMap<Long, ToDo> todos;
	private Long idCounter = 0L;
	
	// hide constuctor
	private ToDoManagerImpl() {
		todos = new HashMap<Long, ToDo>();
	}

	// get ToDoManager by using static method instead of constuctor
	public static ToDoManager getInstance() {
		if (instance == null) {
			instance = new ToDoManagerImpl();
		}
		return instance;
	}
	
	@Override
	public List<ToDo> getAll() {
		return new ArrayList<ToDo>(todos.values());
	}

	@Override
	public ToDo getById(Long id) {
		ToDo result = todos.get(id);
		return result;
	}

	@Override
	public Long add(String content, boolean done) {
		idCounter++;
		ToDo todo = new ToDo(idCounter, content, done);
		todos.put(idCounter, todo);
		return idCounter;
	}

	@Override
	public void remove(Long id) {
		todos.remove(id);
	}

	@Override
	public void update(Long id, String content, boolean done) {
		ToDo todo = todos.get(id);
		todo.setContent(content);
		todo.setDone(done);
	}

}
