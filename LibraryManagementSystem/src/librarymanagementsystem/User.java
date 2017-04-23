package librarymanagementsystem;

class User {

    private int User_ID;
    private String User_FirstName;
    private String User_Surname;
    private String User_CellNumber;
    private int User_BorrowBook;
    private String Book_IDs;

    public User(String userID, String fName, String sName, String cellNum, String bBook) {
        User_ID = Integer.parseInt(userID);
        User_FirstName = fName;
        User_Surname = sName;
        User_CellNumber = cellNum;
        User_BorrowBook = Integer.parseInt(bBook);
    }
    
    public void setBookIDs(String id){
        Book_IDs = id;
    }
    
    public String getBookIDs(){
        return Book_IDs;
    }
    
    public void setUserID(int i) {
        User_ID = i;
    }

    public void setFirstName(String fname) {
        User_FirstName = fname;
    }

    public void setSurname(String sname) {
        User_Surname = sname;
    }

    public void setCellNum(String cnum) {
        User_CellNumber = cnum;
    }

    public int getUserID() {
        return User_ID;
    }

    public String getFirstName() {
        return User_FirstName;
    }

    public String getSurname() {
        return User_Surname;
    }

    public int getBorrowBook() {
        return User_BorrowBook;
    }

    public void setBorrowBook(int bBook) {
        User_BorrowBook = bBook;
    }

    public String getCellNum() {
        return User_CellNumber;
    }

    public String toString() {
        return User_FirstName + " " + User_Surname;
    }
    
    public String save(){
        String books = "["+Book_IDs+"]";
        return User_ID +","+User_FirstName+","+User_Surname+","+User_CellNumber+","+User_BorrowBook+","+books+"\n";
    }
}
