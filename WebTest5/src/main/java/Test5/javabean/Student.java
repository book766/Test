package Test5.javabean;

public class Student {
    /** 学生学号 */
    private Integer stud_id;

    /** 学生姓名 */
    private String stud_name;

    /** 学生性别 */
    private String stud_gender;

    /** 学生地址 */
    private String stud_address;

    /** 学生手机号 */
    private String stud_phone;

    public Student() {
    }

    public Student(Integer stud_id, String stud_name, String stud_gender, String stud_address, String stud_phone) {
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.stud_gender = stud_gender;
        this.stud_address = stud_address;
        this.stud_phone = stud_phone;
    }

    public Integer getStud_id() {
        return stud_id;
    }

    public void setStud_id(Integer stud_id) {
        this.stud_id = stud_id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }

    public String getStud_gender() {
        return stud_gender;
    }

    public void setStud_gender(String stud_gender) {
        this.stud_gender = stud_gender;
    }

    public String getStud_address() {
        return stud_address;
    }

    public void setStud_address(String stud_address) {
        this.stud_address = stud_address;
    }

    public String getStud_phone() {
        return stud_phone;
    }

    public void setStud_phone(String stud_phone) {
        this.stud_phone = stud_phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stud_id=" + stud_id +
                ", stud_name='" + stud_name + '\'' +
                ", stud_gender='" + stud_gender + '\'' +
                ", stud_address='" + stud_address + '\'' +
                ", stud_phone='" + stud_phone + '\'' +
                '}';
    }
}
