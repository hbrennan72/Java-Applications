
/**********************************************************************
* Hugh Brennan		          |
* CITP 190			  		  |
* April 20, 2012   	  		  |
* Project 12		       	  |
* *********************************************************************
* 
* The <code>CustomerIO</code> class was borrowed from the AddressBookIO
* file from Project 6.  I have added comments to code that has been
* modified.
* 
**********************************************************************/

import java.io.*;

public class CustomerIO
{
	//The text file was renamed and the column width was increased 
	//from 20 to 25. 
	private static File customerFile = new File("customers.txt");
    private static final String FIELD_SEP = "\t";
    private static final int COL_WIDTH = 25;  

    /****************************************************************
    * 
    * This method returns a string that displays all entries in 
    * the customers.txt file.  I have modified the column headings
    * and changed the names of the column headings.
    * 
    ****************************************************************/
    public static String getEntriesString()
    {
        BufferedReader in = null;
        try
        {
            checkFile();

            in = new BufferedReader(
                 new FileReader(customerFile));

            // I altered the String entry labels
            String entriesString = "";
            entriesString = padWithSpaces("Email", COL_WIDTH)
                + padWithSpaces("First name", COL_WIDTH)
                + padWithSpaces("Last name", COL_WIDTH)
                + "\n";

            entriesString += padWithSpaces("------------------", COL_WIDTH)
                + padWithSpaces("------------------", COL_WIDTH)
                + padWithSpaces("------------------", COL_WIDTH)
                + "\n";

            // append each line in the file to the entriesString
            String line = in.readLine();
            while(line != null)
            {
                String[] columns = line.split(FIELD_SEP);
                String email = columns[0];
                String fName = columns[1];
                String lName = columns[2];

                entriesString +=
                    padWithSpaces(email, COL_WIDTH) +
                    padWithSpaces(fName, COL_WIDTH) +
                    padWithSpaces(lName, COL_WIDTH) +
                    "\n";

                line = in.readLine();
            }
            return entriesString;
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return null;
        }
        finally
        {
            close(in);
        }
    }

    /****************************************************************
    * 
    * This method saves entries to the customers.txt file. I have 
    * modified which entries are printed at the end of the file.
    *  
    ****************************************************************/
    public static boolean saveEntry(Customer entry)
    {
        PrintWriter out = null;
        try
        {
            checkFile();

            // open output stream for appending
            out = new PrintWriter(
                  new BufferedWriter(
                  new FileWriter(customerFile, true)));

            // write all entry to the end of the file
            out.print(entry.getEmail() + FIELD_SEP);
            out.print(entry.getFirstName() + FIELD_SEP);
            out.print(entry.getLastName() + FIELD_SEP);
            out.println();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
            return false;
        }
        finally
        {
            close(out);
        }
        return true;
    }

    // a private method that creates a blank file if the file doesn't already exist
    private static void checkFile() throws IOException
    {
        // if the file doesn't exist, create it
        if (!customerFile.exists())
            customerFile.createNewFile();
    }

    // a private method that closes the I/O stream
    private static void close(Closeable stream)
    {
        try
        {
            if (stream != null)
                stream.close();
        }
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    // a private method that is used to set the width of a column
    private static String padWithSpaces(String s, int length)
    {
        if (s.length() < length)
        {
            StringBuilder sb = new StringBuilder(s);
            while(sb.length() < length)
            {
                sb.append(" ");
            }
            return sb.toString();
        }
        else
        {
            return s.substring(0, length);
        }
    }
}
