import Example.ContactService;
import Example.ContactServiceImpl;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;

public class ContactServiceTest {
    @Test
    public void testGetNameById_01() {

        ContactService service = new ContactServiceImpl();
        String name = service.getNameById(101);
        assertNotNull(name);
    }

}














 //   public void testGetNameById_02(){

       // ContactService service = new ContactServiceImpl();
      //  String name = service.getNameById(101);
     //   assertNotNull(name);
   // }
//}
