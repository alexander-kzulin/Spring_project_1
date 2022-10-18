package by.kaziulin.spring.utill;

import by.kaziulin.spring.dao.PersonDAO;
import by.kaziulin.spring.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class PersonValidator implements Validator {

    private PersonDAO personDAO;

    @Autowired
    public PersonValidator(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @Override
    public boolean supports(Class<?> aclass) {
        return Person.class.equals(aclass);
    }

    @Override
    public void validate(Object o, Errors errors) {
Person person = (Person) o;
if (personDAO.show(person.getNameLastName()).isPresent()) {
    errors.rejectValue("nameLastName", "", "User with this name already exists");
        }
    }
}
