package collections;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Jeka on 06/10/2016.
 */
public class PersonDaoImpl implements PersonDao {

    private DataFactory dataFactory = new DataFactory();

    @Override
    public String getPerson(int id) {
        return dataFactory.getName();
    }
}
