import java.sql.*;
class Mysqlcon{
public static void main(String args[]){
    try{
        Connection dbCxn=DriverManager.getConnection(
            /*There was something running on port 23306 on my laptop, not sure what it was
            but it was preventing me from connecting to the database. I changed the port
            number to 23300 on my machine (localhost:23300:localhost:23306) and it worked.
            */
            "jdbc:mysql://localhost:23300/ThisAndThat","root","cooleomuseo"
        );
        Statement selectThis=dbCxn.createStatement();
        ResultSet rsThis = selectThis.executeQuery("SELECT * FROM This");
        while(rsThis.next()){
            System.out.println(rsThis.getInt(1)
            + " " + rsThis.getString(2)
            + " " + rsThis.getInt(3)
            + " " + rsThis.getDate(4)
            + " " + rsThis.getString(5)
            );
        }
        dbCxn.close();
    }catch(Exception e){ System.out.println(e);}
    }
}