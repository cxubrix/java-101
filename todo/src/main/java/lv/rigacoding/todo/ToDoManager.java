package lv.rigacoding.todo;

import java.util.List;

public interface ToDoManager {

	List<ToDo> getAll();

	ToDo getById(Long id);

	Long add(String content, boolean done);

	void remove(Long id);

	void update(Long id, String content, boolean done);
}
