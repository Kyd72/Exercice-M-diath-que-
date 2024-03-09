package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();


	private final BookPrinter bookPrinter = new BookPrinter() ;



	private final CDPrinter cdPrinter= new CDPrinter();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}
	
	public void printOnlyBooks() {
		for (Item item : items){

			item.accept(bookPrinter);
		}
	}

	public void printOnlyCDs() {
		for (Item item : items){

			item.accept(cdPrinter);
		}
	}

}
