import java.util.Comparator;

public class Book implements Comparable<Book> {
  private String name;
  private int totalPage;
  private String author;
  private String publishDate;

   /* @Override
    public int compareTo(Book o) {
        return this.getName().compareTo(o.getName());
    } */

    @Override
    public int compareTo (Book o) {
        return this.getTotalPage() - o.getTotalPage();
    }



  public Book(String name, int totalPage, String author, String publishDate) {
      this.name = name;
      this.totalPage = totalPage;
      this.author = author;
      this.publishDate = publishDate;
  }

  //GETTER SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }


}
