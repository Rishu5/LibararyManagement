class Library{
	String [] books;
	int no_of_books;
	Library(){
		this.books =new String[100];
		this.no_of_books=0;
	}
	public void addBook(String books) {
		this.books[no_of_books]=books;
		no_of_books++;
		System.out.println(books+"has been added ");
	}
	public void issuBook(String books) {
		for(int i =0;i<this.books.length;i++) {
			if(this.books[i].equals(books)) {
				System.out.println("this book has been ishud");
				this.books[i]=null;
				return;
			}
		}
		System.out.println("this book does not exist");
	}


	public void returnBook(String book) {
		addBook(book);
		
	}
	public void showAvelableBook() {
		
			for(String item : this.books) {
				if(item == null){
					continue;
				}
				System.out.println("* "+item);
		}
	}
}
public class LibraryManagement {
	public static void main(String[] args) {
		Library centralLibrary = new Library();
		centralLibrary.addBook("things and grow rich");
		centralLibrary.addBook("physics");
		centralLibrary.addBook("chemistry");
		centralLibrary.addBook("viology");
		centralLibrary.showAvelableBook();
		centralLibrary.issuBook("physics");
		centralLibrary.returnBook("viology");
		
	}

}
