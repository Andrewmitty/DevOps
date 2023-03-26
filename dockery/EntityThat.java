/**
 * @author Andrew Mitty
 */

/**
 * A class that represents the THAT table in the database. It contains getters
 * and setters for values related to the THAT table.
 * It also contains methods to create, read, update, and delete entities from
 * the THAT table in the database.
 * It also contains a method to set the connection to the database which must be
 * executed before any other methods in this class.
 * It also contains a method to save or change the active entity in the
 * database.
 */
public class EntityThat {

    // --------Variables--------

    private int That_pk;
    private String That_mno;
    private String That_pqr;
    private int That_This_pk;
    private static JDBCConnectionMaker dbCxnMaker;

    // --------Constructors--------

    /**
     * A no-arg constructor for EntityThat which creates an empty EntityThat object
     */
    public EntityThat() {

        // Create an empty EntityThat object

    }

    /**
     * A constructor for EntityThat which creates an EntityThat object with the
     * given primary key
     * 
     * @param PK The primary key of the EntityThat
     */
    public EntityThat(int PK) {

        // Create an EntityThat object with the given id

    }

    // --------CRUD Methods--------

    /**
     * Executes an INSERT INTO statement onto the THAT table in the db
     * 
     * @param query The query to be executed
     */
    private void create(String query) {

        // Create the entity

    }

    /**
     * Executes a SELECT statement onto the THAT table in the db
     * 
     * @param query The query to be executed
     */
    private void read(String query) {

        // Read the entity

    }

    /**
     * Executes an UPDATE statement onto the THAT table in the db
     * 
     * @param query The query to be executed
     */
    private void update(String query) {

        // Update the entity

    }

    /**
     * Executes a DELETE statement onto the THAT table in the db
     * 
     * @param query The query to be executed
     */
    private void delete(String query) {

        // Delete the entity

    }

    /**
     * Saves a new entity to the current instance. If the entity already exists,
     * it will be updated. If the entity does not exist, it will be created.
     * 
     * @return True if the entity was saved successfully, false otherwise
     */
    public boolean save() {

        // Save the entity
        return true;

    }

    /**
     * Loads the entity from the database by calling read()
     * 
     * @param PK The primary key of the entity to be loaded from the database
     * @return True if the entity was loaded successfully, false otherwise
     */
    public boolean load(int PK) {

        // Load the entity
        return true;

    }

    /**
     * Deletes the entity from the database by calling delete()
     * 
     * @param PK The primary key of the entity to be deleted from the database
     * @return True if the entity was deleted successfully, false otherwise
     */
    public boolean remove(int PK) {

        // calls delete()
        return true;

    }

    // --------Methods--------

    /**
     * Sets the connection to the database for future calls to it using other
     * funcitons in this class.
     * Must be called before any other functions in this class.
     * 
     * @param dbName     also called the schema
     * @param hostName   the host name of the db
     * @param portNumber the port number of the db
     * @param userName   the username to sign into the db with
     * @param password   the password to sign into the db with
     * @return True if the connection was set successfully, false otherwise
     */
    public boolean setJBDCConnection(String dbName, String hostName, String portNumber, String userName,
            String password) {

        // Set the connection to the database
        dbCxnMaker = new JDBCConnectionMaker(dbName, hostName, portNumber, userName, password);
        return true;

    }

    // make getters and setters for a That_pk (int), That_mno (string), That_pqr
    // (string), That_This_pk (int)

    /**
     * Gets the primary key of the current entity
     * 
     * @return The primary key of the current entity
     */
    public int getThat_pk() {

        // Get the That_pk
        return this.That_pk;

    }

    /**
     * Gets the mno of the current entity
     * 
     * @return The mno of the current entity
     */
    public String getThat_mno() {

        // Get the That_mno
        return this.That_mno;

    }

    /**
     * Sets the mno of the current entity
     * 
     * @param That_mno The requested mno of the current entity
     */
    public void setThat_mno(String That_mno) {

        // Set the That_mno
        this.That_mno = That_mno;

    }

    /**
     * Gets the pqr of the current entity
     * 
     * @return The pqr of the current entity
     */
    public String getThat_pqr() {

        // Get the That_pqr
        // return That_pqr;
        return this.That_pqr;

    }

    /**
     * Sets the pqr of the current entity
     * 
     * @param That_pqr The requested pqr of the current entity
     */
    public void setThat_pqr(String That_pqr) {

        // Set the That_pqr
        this.That_pqr = That_pqr;

    }

    /**
     * Gets the That_This_pk of the current entity
     * 
     * @return The That_This_pk of the current entity
     */
    public int getThat_This_pk() {

        // Get the That_This_pk
        return this.That_This_pk;

    }

    /**
     * Sets the That_This_pk of the current entity
     * 
     * @param That_This_pk The requested That_This_pk of the current entity
     */
    public void setThat_This_pk(int That_This_pk) {

        // Set the That_This_pk
        this.That_This_pk = That_This_pk;

    }

}