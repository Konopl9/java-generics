package com.mishcma.sorting;

public class BookComparable implements Comparable<BookComparable> {

    private String authorName;
    private String title;
    private int numberOfPages;

    public BookComparable() {
    }

    public BookComparable(String authorName, String title, int numberOfPages) {
        this.authorName = authorName;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
            "authorName='" + authorName + '\'' +
            ", title='" + title + '\'' +
            ", numberOfPages=" + numberOfPages +
            '}';
    }

    @Override
    public int compareTo(BookComparable o) {
        return this.title.compareTo(o.getTitle());
    }
}
