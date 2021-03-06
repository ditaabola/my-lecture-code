package lv.dita;

import lv.dita.bookstore.Author;
import lv.dita.bookstore.Book;

public class TestBookStore {

	public static void main(String[] args) {
		Author rowling = new Author("J.K.Rowling", "rowling@harrypotter.com",
				'f');
		Author rainis = new Author("Rainis", "rainis@rainis.com", 'm');
		
		System.out.println(rowling.getEmail());
		rowling.setEmail("rowling@gmail.com");
		System.out.println(rowling.getEmail());
		System.out.println("____________________________");

		Author test1 = new Author("name", "name@name.com", 'f');
		Author test2 = new Author("name", "name@name.com", 'm');
		Author test3 = new Author("Inga", "inga@inga.com", 'f');
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		System.out.println(test3.toString());
		System.out.println("____________________________");

		
		Book testbook = new Book ("New Book", new Author ("New author", "author@author.com", 'f'), 24.0, 4);
		System.out.println(testbook.toString());
	}

}
