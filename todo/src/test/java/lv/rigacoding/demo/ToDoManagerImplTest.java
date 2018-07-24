package lv.rigacoding.demo;

import org.junit.Assert;
import org.junit.Test;

import lv.rigacoding.todo.ToDoManager;
import lv.rigacoding.todo.ToDoManagerImpl;

public class ToDoManagerImplTest {

	@Test
	public void smokeTest() {
		ToDoManager manager = ToDoManagerImpl.getInstance();
		Assert.assertNotNull(manager);
	}

	@Test
	public void addTest() {
		ToDoManager manager = ToDoManagerImpl.getInstance();
		Long id = manager.add("Test", true);
		Assert.assertNotNull(id);
		Assert.assertEquals(1, manager.getAll().size());
	}

	@Test
	public void addRemove() {
		ToDoManager manager = ToDoManagerImpl.getInstance();
		manager.add("Test", true);
		manager.add("Test", true);
		Long id = manager.add("Test remove", true);
		manager.add("Test", true);
		manager.add("Test", true);
		Assert.assertEquals(6, manager.getAll().size());
		manager.remove(id);
		Assert.assertNull(manager.getById(id));
		Assert.assertEquals(5, manager.getAll().size());

	}

}
