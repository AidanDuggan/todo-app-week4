package ie.cit;

import java.util.List;

import ie.cit.adf.dao.TodoRepository;
import ie.cit.adf.domain.Todo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TodoApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");
		TodoRepository todoRepository = ctx.getBean(TodoRepository.class); //note its the interface type (TodoRepository) - generic

		List<Todo> all = todoRepository.getAll();
		System.out.println(all);

		Todo todo2 = new Todo();
		todo2.setText("Please Close Windows");
		todoRepository.insert(todo2);
	}

}
