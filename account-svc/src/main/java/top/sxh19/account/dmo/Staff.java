package top.sxh19.account.dmo;

public class Staff {
    private Integer staffId;
    private String firstName;
    private String lastName;

    public Staff() {
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

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

    public Staff(Integer staffId, String firstName, String lastName) {
        this.staffId = staffId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
