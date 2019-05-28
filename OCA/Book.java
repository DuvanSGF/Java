package clase;

public class Book {

	  private int pages;
	  private String title;
	  private int actualPage;
	  public int getActualPage() {
	    return actualPage;
	  }
	  public void setActualPage(int actualPage) {
	    this.actualPage = actualPage;
	  }
	  public Book(int pages, String title) {
	    super();
	    this.pages = pages;
	    this.title = title;
	  }

	  public void next() {
		  actualPage++;
	  }
	  public void next(int number) {
		  actualPage += number;
	  }
	}