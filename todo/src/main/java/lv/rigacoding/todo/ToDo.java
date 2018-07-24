package lv.rigacoding.todo;

public class ToDo {

	private Long id;
	private String content;
	private boolean done;

	// used to create ToDo object as input from json
	public ToDo() {
	}
	
	public ToDo(Long id, String content, boolean done) {
		this.id = id;
		this.content = content;
		this.done = done;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", content=" + content + ", done=" + done + "]";
	}

}