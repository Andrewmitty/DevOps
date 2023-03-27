// Imports
import JDBCConnectionMaker.JDBCConnectionMaker;

/**
 * This class represents an entry in the "This" table within the "ThisAndThat" database as an "EntityThis". Each
 * EntityThis object stores the information associated with the primary key provided in the constructor.
 * Getters and setters are provided to obtain and update all the values of an "EntityThis" object.
 *
 * The class also includes four private methods that run the general CRUD operations (create(), read(), update(), delete())
 * on the "This" database, which can easily be accessed via that three public methods save(), load(), and remove().
 *
 * For the construction of EntityThis objects as well as facilitating connectivity between the EntityThis objects and the database,
 * a JDBCConnectionMaker object is utilized to establish a connection to the database in order to perform CRUD operations.
 * The JDBCConnectionMaker instance, dbCxnMaker, can be initialized with the setter setDbCxnMaker(). 
 *
 * @author Matthew Thompson Soto
 * @version 2023.03.26
 */
public class EntityThis {
    // ----------- Variables -----------
    private int primaryKey; // The primary key of the 
    private String abc; // The 'abc' value of the EntityThis object
    private int def; // The 'def' value of the EntityThis object
    private String ghi; // The 'ghi' value of the EntityThis object; convert 'datetime' to a 'String'
    private String jkl; // The 'jkl' value of the EntityThis object; convert 'enum' to a 'String'
    private static JDBCConnectionMaker dbCxnMaker; // The object through which interactions with DB are made possible

    // ----------- Constructors -----------
    /**
     * Default constructor for the EntityThis class. 
     *
     * NOTE: The constructor assumes dbCnxMaker is initialized!
     * 
     * Creates an empty EntityThis object.
     */
    public EntityThis() {
        // Create the default constructor
    }

    /**
     * Constructor that utilizes a primary key to create an EntityThis object.
     * It utilizes the primary key provided and attempts to read that row from the database.
     *
     * NOTE: The constructor assumes dbCnxMaker is initialized! 
     * 
     * @param primaryKey - integer representing the primary key
     */
    public EntityThis(int primaryKey) {
        // Create the constructor using primary key
    }

    // ----------- Private Methods -----------
    /**
     * This method executes an INSERT INTO statement into the "This" table, creating a new entity.
     * The method will automatically generate a primary key using auto-increment.
     */
    private void create() {
        // Create the entity
    }

    /**
     * This method executes a READ statement into the "This" table, retreiving the information using the specified primary key.
     * 
     * @param primaryKey - the primary key of the entry to be read
     */
    private void read(int primaryKey) {
        // Read the entity using the primary key
    }

    /**
     * This method executes an UPDATE statement into the "This" table, updating the information using the specified primary key.
     *
     * @param primaryKey - the primary key of the entry to be updated
     */
    private void update(int primaryKey) {
        // Update the entity
    }

    /**
     * This method executes an DELETE statement into the "This" table, deleting the entry associated with the specified primary key.
     *
     * @param primaryKey - the primary key of the entry to be deleted
     */
    private void delete(int primaryKey) {
        // Delete the entity
    }

    // ----------- Public Methods -----------
    /**
     * This method saves an entity to the table, calling one of two methods: 
     * - create(): The entity is not currently in the table; an entry is created in the table.
     * - update(): The entity is in the table; information is updated accordingly in the table.
     */
    public void save(int primaryKey) {
        // Call the private create() or update() function based on whether it exists in table or not.
    }

    /**
     * This method loads an entity by calling the read() function, retreiving infromation from the table.
     */
    public void load() {
        // Call the private read() function
    }

    /**
     * This method removes an entity by calling the delete() function, permanently removing it from the table.
     */
    public void remove() {
        // Call the private delete() function
    }

    // ----------- Getters and Setters -----------
    /**
     * This method serves as the setter for the private static class member 'dbCxnMaker', which is a JDBCConnectionMaker object.
     * The setter creates a new JDBCConnectionMaker object, setting the value of the Object to 'dbCxnMaker', which is used
     * to establish connectivity with the database.
     * 
     * @param dbName - the database's name / the schema
     * @param hostName - the database's host name
     * @param portNumber - the database's port number
     * @param userName - the username to sign into the database
     * @param password - the password to sign into the database
     */
    public void setDbCxnMaker(String dbName, String hostName, String portNumber, String userName, String password) {
        // Set the value of dbCxnMaker
        this.dbCxnMaker = new JDBCConnectionMaker(dbName, hostName, portNumber, userName, password);
    }

    /**
     * Getter method for retrieving the "abc" value of this EntityThis object.
     *
     * @return the value of abc as a String 
     */
    public String getAbc() {
        // Return the value of this.abc
        return this.abc;
    }

    /**
     * Setter method for updating the "abc" value of this EntityThis object.
     *
     * @param abc - the new String value to be set 
     */
    public void setAbc(String abc) {
        // Set the value of this.abc
        this.abc = abc;
    }

    /**
     * Getter method for retrieving the "def" value of this EntityThis object.
     *
     * @return the value of def as an int
     */
    public int getDef() {
        // Return the value of this.def
        return this.def;
    }

    /**
     * Setter method for updating the "def" value of this EntityThis object.
     *
     * @param def - the new int value to be set 
     */
    public void setDef(int def) {
        // Set the value of this.def
        this.def = def;
    }

    /**
     * Getter method for retrieving the "ghi" value of this EntityThis object.
     *
     * @return the value of def as a String
     */
    public String getGhi() {
        // Return the value of this.ghi
        return this.ghi;
    }

    /**
     * Setter method for updating the "ghi" value of this EntityThis object.
     *
     * @param ghi - the new String value to be set 
     */
    public void setGhi(String ghi) {
        // Set the value of this.ghi
        this.ghi = ghi;
    }

    /**
     * Getter method for retrieving the "jkl" value of this EntityThis object.
     *
     * @return the value of def as a String
     */
    public String getJkl() {
        // Return the value of this.jkl
        return this.jkl;
    }

    /**
     * Setter method for updating the "jkl" value of this EntityThis object.
     *
     * @param jkl - the new String value to be set 
     */
    public void setJkl(String jkl) {
        // Set the value of this.jkl
        this.jkl = jkl;
    }
}