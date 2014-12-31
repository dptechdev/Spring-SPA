package com.springspa;

import java.util.List;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Books", path= "Book")
public interface BookRepository extends PagingAndSortingRepository<Book, Integer>{

	List<Book> findByTitle(@Param("title") String title);
	List<Book> findByAuthor(@Param("author") String author);
	
}
