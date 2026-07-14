package StudentHandling;

import java.util.Date;

public class Student {
    String registration_id;
    String first_name;
    String last_name;
    String gender;
    Date date_of_birth;
    String email;
    String phone;
    int grade;
    String section;
    Date admission_date;
    String address;

    public Student(String registration_id, String first_name, String last_name, String gender, Date date_of_birth, String email, String phone, int grade, String section, Date admission_date, String address) {
        this.registration_id = registration_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.date_of_birth = date_of_birth;
        this.email = email;
        this.phone = phone;
        this.grade = grade;
        this.section = section;
        this.admission_date = admission_date;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "registration_id='" + registration_id + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", date_of_birth=" + date_of_birth +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", grade=" + grade +
                ", section='" + section + '\'' +
                ", admission_date=" + admission_date +
                ", address='" + address + '\'' +
                '}';
    }
}
