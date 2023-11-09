
public class book {
private int bkid;
private String name;
private String author;
//inner class in non static
 class lesson{
	private int lid;
	private String lname;
	
	public void m1() {
		System.out.println("in m1"+bkid);
	}
}
 //inner class static
 static class lesson1{
	 private int id;
	 private String name;
	 public void m1() {
		 System.out.println("iereur");
	 }
 }
public book() {
	super();
}
public book(int bkid, String name, String author) {
	super();
	this.bkid = bkid;
	this.name = name;
	this.author = author;
}
public int getBkid() {
	return bkid;
}
public void setBkid(int bkid) {
	this.bkid = bkid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
@Override
public String toString() {
	return "book [bkid=" + bkid + ", name=" + name + ", author=" + author + "]";
}

}
