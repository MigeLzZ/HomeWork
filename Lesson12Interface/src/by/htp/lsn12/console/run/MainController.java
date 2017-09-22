package by.htp.lsn12.console.run;

import by.htp.lsn12.entity.Book;
import by.htp.lsn12.entity.Catalog;
import by.htp.lsn12.logic.Librarian;
import by.htp.lsn12.logic.LibrarianConsoleOperationImpl;
import by.htp.lsn12.logic.LibrarianConsoleOperationImplChild;
import by.htp.lsn12.logic.LibrarianDefaultOperationImpl;
import by.htp.lsn12.logic.LibrarianOperation;

public class MainController {

	public static void main(String[] args) {
		
		Librarian librarian = new Librarian();
		
		Catalog catalog = librarian.veiwCatalog();
		Catalog catalog2 = librarian.viewScannerCatalog();
		
		//LibrarianOperation libOperation = new LibrarianDefaultOperationImpl();
		LibrarianOperation libOperation = new LibrarianConsoleOperationImplChild();
		
		Catalog catalog3 = libOperation.viewCatalog();
		
		System.out.println("");
	}

}
