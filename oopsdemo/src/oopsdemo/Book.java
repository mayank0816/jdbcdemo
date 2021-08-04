package oopsdemo;

public class Book {

	int BookId;
    String bookName;
    float price;
    String Publisher;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", bookName=" + bookName + ", price=" + price + ", Publisher=" + Publisher
				+ "]";
	}
    
    
}
