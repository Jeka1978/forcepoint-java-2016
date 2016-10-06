package collections;

/**
 * Created by Jeka on 06/10/2016.
 */
public class PersonServiceImpl implements PersonService {


    private PersonDao dao = new PersonDaoImpl();

    @Override
    public String findPersonById(int id) {
        return dao.getPerson(id);
    }

}
