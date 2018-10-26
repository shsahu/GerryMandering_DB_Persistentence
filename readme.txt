/**
 * Method to save the object attributes as a new entry in DB
 * @param Object of the class to be saved into DB
 * @return success statue
 * @throws Throwable : use getStackTrace() to find the error
 */
public boolean persisttoDB(Object o) throws Throwable;


/**
 * Method to get all the records for the given class from DB
 * @param c: Class reference of class object to be queried
 * @return List containing all the records
 * @throws Throwable
 */
public List<Object> getAllRecords(Class c) throws Throwable

/**
 * Method to get records based on criteria passed as param
 * @param c : Class reference of class object to be queried
 * @param criteria: map containing attribute and their values
 * @return List containing all the records
 * @throws Throwable
 */
public List<Object> getRecordsBasedOnCriteria(Class c, Map<String,Object>criteria) throws Throwable