package collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by Jeka on 06/10/2016.
 */
public class PersonServiceImplTest {


    private PersonServiceImpl personService = new PersonServiceImpl();

    public PersonServiceImplTest() {
        System.out.println("construt");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @Test
    public void testToUpperCaseIsWorking() throws Exception {

        Assert.assertEquals("JAVA",personService.toUpperCase("java"));
    }

    @Test
    public void findPersonById() throws Exception {

        PersonDao mockDao = mock(PersonDao.class);
        when(mockDao.getPerson(anyInt())).thenReturn("Ran");



        personService.setDao(mockDao);
        String personName = personService.findPersonById(2);
//        Thread.sleep(2000);
        personName = personService.findPersonById(2);
        verify(mockDao, times(1)).getPerson(2);

        Assert.assertEquals("Ran",personName);


    }

    @Test
    public void webserviceRecievedJeka() throws Exception {
        WebService webServiceMock = mock(WebService.class);
        personService.setWebservice(webServiceMock);
        personService.fireMostExpensiveEmployee();
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(webServiceMock).fire(captor.capture());

        Assert.assertEquals("jeka",captor.getValue());

    }
}