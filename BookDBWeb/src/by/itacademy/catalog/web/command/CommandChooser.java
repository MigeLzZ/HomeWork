package by.itacademy.catalog.web.command;

import by.itacademy.catalog.web.command.impl.AddBook;
import by.itacademy.catalog.web.command.impl.AddBookAction;
import by.itacademy.catalog.web.command.impl.DeleteBook;
import by.itacademy.catalog.web.command.impl.DeleteBookAction;
import by.itacademy.catalog.web.command.impl.ViewBook;
import by.itacademy.catalog.web.command.impl.ViewBookAction;
import by.itacademy.catalog.web.command.impl.ViewBookList;

public class CommandChooser {

	public static BasicAction performAction(ActionType action) {
		
		BasicAction basicAction = null;
		
		switch(action){
		case ADD_BOOK:
			basicAction = new AddBook();
			break;
		case ADD_BOOK_ACTION:
			basicAction = new AddBookAction();
			break;
		case VIEW_BOOK:
			basicAction = new ViewBook();
			break;
		case VIEW_BOOK_ACTION:
			basicAction = new ViewBookAction();
			break;
		case VIEW_BOOK_LIST:
			basicAction = new ViewBookList();
			break;
		case DELETE_BOOK:
			basicAction = new DeleteBook();
			break;
		case DELETE_BOOK_ACTION:
			basicAction = new DeleteBookAction();
			break;
		}
		return basicAction;
	}
	
}
