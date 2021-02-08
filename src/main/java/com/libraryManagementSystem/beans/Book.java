package com.libraryManagementSystem.beans;

public class Book
{

       public int bookId;
       public String bookName;
       public String authName;
       public String subject;
       public int pages ;
       public double price;
       public boolean isAvilable;
       public Student issuedTo;

        public Book()
        {

        }

        public Book(int bookId,String bookName, String authName,String subject, int pages,double price)
        {
            this.bookId = bookId;
            this.bookName = bookName;
            this.authName = authName;
            this.subject=subject;
            this.pages = pages;
            this.price = price;
            this.isAvilable=true;
            this.issuedTo=null;
        }



    public void setBook_id(int bookId) {
            this.bookId = bookId;
        }

        public void setNo_of_pages(int pages) {
            this.pages = pages;
        }

        public void setBook_name(String bookName) {
            this.bookName = bookName;
        }

        public void setAuth_name(String authName) {
            this.authName = authName;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getSubject() {
        return subject;
        }

        public void setSubject(String subject) {
           this.subject = subject;
       }

    public boolean isAvilable() {
        return isAvilable;
    }

    public void setAvilable(boolean avilable) {
        isAvilable = avilable;
    }

    public Student getIssuedTo() {
        return issuedTo;
    }

    public void setIssuedTo(Student issuedTo) {
        this.issuedTo = issuedTo;
    }

    public int getBookId() {
            return bookId;
        }

        public int getPages() {
            return pages;
        }

        public String getBookName() {
            return bookName;
        }

        public String getAuthName() {
            return authName;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString()
        {
            String name = (issuedTo==null) ? "None" : issuedTo.getName();
            return "Book [bookId=" + bookId +
                    ", bookName=" + bookName +
                    ", authName=" + authName +
                    ", subject='" + subject +
                    ", pages=" + pages +
                    ", price=" + price +
                    "  is Avilable= " + isAvilable +
                    "  issued to="  + name+ "]";
        }



}



