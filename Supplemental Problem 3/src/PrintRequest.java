/**
 * PrintRequest Class
 * @author hinchman17
 * Contains relevant information regarding a user for printing.
 */
public class PrintRequest
{
  //**************
  // Fields
  //************** 
    String user;
    int pages;
    int hours; //presumed to go from 0 to 23
    int minutes; //presumed to go from 0 to 59
    String clocktime = hours + ":" + minutes; //can go up to 999
    
    
   //**************
   // Constructor 
   //**************
    /**
     * PrintRequest
     * Constructor as indicated by the object creation and its input
     * @param user
     * @param pages
     * @param hours
     * @param minutes
     * @return new PrintRequest object
     */
      public PrintRequest(String user, int pages, int hours, int minutes) {
        this.user = user;
        this.pages = pages;
        this.clocktime = hours + ":" + minutes;
      }// PrintRequest(String, int, int, int)
      
    //**************
    // Methods 
    //**************

      /**
       * setUser(String)
       * changes user field to the new String indicated by method input
       * @param newUser
       */
      public void setUser(String newUser) {
    	  user = newUser;
      }//setUser(String)
      
      /**
       * getUser()
       * getter method for user
       * @return the user field of this object
       */
      public String getUser() {
    	  return user;
      }// getUser()
      
      /**
       * setUser(int)
       * changes user field to the new int indicated by method input
       * @param newPages
       */
      public void setPages(int newPages) {
    	  pages = newPages;
      }// setPages(int)
      
      /**
       * getPages()
       * getter method for pages
       * @return the pages field of this object
       */
      public int getPages() {
    	  return pages;
      }// getPages()
      
      /**
       * setClocktime(int, int)
       * changes clock time to the new time indicated by method input
       * @param newHours
       * @param newMinutes
       */
      public void setClocktime(int newHours, int newMinutes) {
    	  hours = newHours;
    	  minutes = newMinutes;
      }// setClocktime(int, int)
      
      /**
       * getClocktime
       * getter method for hours and minutes
       * @return the clocktime field of this obejct
       */
      public String getClocktime() {
    	  return clocktime;
      }// getClocktime()

}// class PrintRequest