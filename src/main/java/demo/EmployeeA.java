package demo;

import org.joda.time.DateTime;

/**
 * Created by jiyeon on 15. 9. 6..
 */
public class EmployeeA {

    String firstName;

    String lastName;

    DateTime birthday;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(DateTime birthday) {
        this.birthday = birthday;
    }



}
