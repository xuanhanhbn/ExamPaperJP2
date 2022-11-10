import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<student> studentList;
    private studentsDao stDao;

    public studentManager() {
        stDao = new studentsDao();
        studentList = stDao.read();
    }

    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        int stId = inputId();
        String adress = inputAdress();
        String phone = inputPhone();
        student st = new student(stId,name,adress,phone);
        studentList.add(st);
    }
    public void save() {
        stDao.write(studentList);

    }
    public void show() {
        for(student st : studentList) {
//            System.out.println("StudentID");
            System.out.format("%5d , ", st.getStudentId());
//            System.out.println("Student Name");
            System.out.format("%20s , ", st.getStudentName());
//            System.out.println("Address");
            System.out.format("%20s , ", st.getStudentAddress());
//            System.out.println("Phone");
            System.out.format("%20s , ", st.getStudentPhone());
            System.out.println("\n");
        }
    }

    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }
    private String inputAdress() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }

    private String inputPhone() {
        System.out.print("Input student phone: ");
        return scanner.nextLine();
    }

    public List<student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<student> studentList) {
        this.studentList = studentList;
    }
}
