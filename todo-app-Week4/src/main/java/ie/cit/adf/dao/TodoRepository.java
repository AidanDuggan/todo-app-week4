// Todo Interface
// don't care where its data is stored
package ie.cit.adf.dao;

import ie.cit.adf.domain.Todo;

import java.util.List;

public interface TodoRepository {
	void insert(Todo todo);

	List<Todo> getAll();

}
