package Lab2.validation;
import Lab2.domain.Student;

public class StudentValidator implements Validator<Student> {

    @Override
    public void validate(Student student) throws ValidationException {
        if (student.getID() == null || student.getID().equals("")) {
            throw new ValidationException("ID invalid! ");
        }
        if (student.getNume() == null || student.getNume().equals("")) {
            throw new ValidationException("Nume invalid! ");
        }
        if (student.getGrupa() <= 110 || student.getGrupa() >= 938) {
            throw new ValidationException("Grupa invalida! ");
        }
    }
}