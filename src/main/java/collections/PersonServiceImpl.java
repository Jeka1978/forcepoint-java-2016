package collections;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.Setter;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by Jeka on 06/10/2016.
 */
@Setter
public class PersonServiceImpl implements PersonService {
    Cache<Integer, String> cache;
    private WebService webservice;


    public void fireMostExpensiveEmployee() {
        String name = "jeka"; // 10 lines of code
        webservice.fire(name);
    }

    public PersonServiceImpl() {
        cache = CacheBuilder.newBuilder().expireAfterAccess(1, TimeUnit.SECONDS).expireAfterWrite(1, TimeUnit.SECONDS)
                .weakKeys().concurrencyLevel(1).maximumSize(10).build();
    }

    private PersonDao dao = new PersonDaoImpl();

    public String toUpperCase(String string) {
        return string.toUpperCase();
    }

    @Override
    public String findPersonById(int id) {
        String name = cache.getIfPresent(id);
        if (name == null) {
            name = dao.getPerson(id);
            cache.put(id,name);
        }
        return name;
    }

}
