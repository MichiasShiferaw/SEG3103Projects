package Example;

import java.util.Locale;

public class ContactServiceImpl implements ContactService{
    private ContactDao contactDao;



    public void setContactDao(ContactDao contactDao){
        this.contactDao= contactDao;
    }
    public String getNameById(Integer id){
        String name = contactDao.findNameById(id);

        //logic

        String formattedName = name.toUpperCase();
        return formattedName;
    }
}
