package librarymanagementsystem;

import java.util.Objects;

class Book
{	
	private int Book_ID;
	private String Book_Title;
	private String Book_Author;
	private String Book_Genre;
	private String Book_ISBN;
        private String Book_Available;

	public Book(String bookID, String title, String author, String genre, String isbn, String available)
	{
		Book_ID = Integer.parseInt(bookID);
		Book_Title = title;
		Book_Author = author;
		Book_Genre = genre;
		Book_ISBN = isbn;
                Book_Available = available;
	}
        
        public Book(String title)
	{
		Book_Title = title;
	}
        
        public Book()
	{
		Book_ID = 0;
		Book_Title = null;
		Book_Author = null;
		Book_Genre = null;
		Book_ISBN = null;
                Book_Available = null;
	}

	public void setBookID(int b)
	{
		Book_ID = b;
	}
	
	public void setTitle(String title)
	{
		Book_Title = title;
	}

	public void setAuthor(String author)
	{
		Book_Author = author;
	}

	public void setGenre(String genre)
	{
		Book_Genre = genre;
	}
	
	public void setISBN(String isbn)
	{
		Book_ISBN = isbn;
	}

	public int getBookID()
	{
		return Book_ID;
	}
	
	public String getTitle()
	{
		return Book_Title;
	}

	public String getAuthor()
	{
		return Book_Author;
	}

	public String getGenre()
	{
		return Book_Genre;
	}

	public String getISBN()
	{
		return Book_ISBN;
	}
        
        public String toString(){
            return Book_Title + " - "+ Book_Author;
        }
        
        public String getAvailable(){
            return Book_Available;
        }
        
        public void setAvailable(boolean available){
            if(available == true){
                Book_Available = "true";
            }else{
                Book_Available = "false";
            }
        }

        public int genreIndex(){
            if(Book_Genre.equals("Computer Science")){
                return 0;
            }
            else if(Book_Genre.equals("Mathematics")){
                return 1;
            }
            else if(Book_Genre.equals("Statistics")){
                return 2;
            }
            else if(Book_Genre.equals("Information Systems")){
                return 3;
            }
            return 4;
        }
        
        public void indexGenre(int value){
            if(value == 0){
                Book_Genre = "Computer Science";
            }
            else if(value == 1){
                Book_Genre = "Mathematics";
            }
            else if(value == 2){
                Book_Genre = "Statistics";
            }
            else if(value == 3){
                Book_Genre = "Information Systems";
            }else{
                Book_Genre = "Other";
            }
        }
        
        public boolean availability(){
            return (Book_Available.equals("true"));
        }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.Book_Title, other.Book_Title)) {
            return false;
        }
        return true;
    }
    
    public String save(){
        if(Book_Available.isEmpty()){
           Book_Available = "false";
        }
        return Book_ID+","+Book_Title+","+Book_Author+","+Book_Genre+","+Book_ISBN+","+Book_Available+"\n";
    }
        
}
