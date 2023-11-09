
public class testbook {
public static void main(String[] args) {
	//when inner class is simple class or non static class
	book b =new book();
	book.lesson l = b.new lesson();
	l.m1();
	//when inner class is static
	book.lesson1 l1=new book.lesson1();
}
}
