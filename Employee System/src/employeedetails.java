
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DB.data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cherry may tulang
 */
public class employeedetails {

    private static final String tableName = "employeedetails";

    private int id;
    private String firstname;
    private String middlename;
    private String lastname;
    private String address;
    private String age;
    private String gender;
    private String educ;

    public employeedetails(int id, String firstname, String middlename, String lastname, String address, String age, String gender, String educ) {
        this.id = id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.educ = educ;
    }

    public employeedetails(String firstname, String middlename, String lastname, String address, String age, String gender, String educ) {
        this(0, firstname, middlename, lastname, address, age, gender, educ);
    }

    public employeedetails() {
        this("", "", "", "", "", "", "");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getaddress() {
        return address;
    }

    public void setadress(String address) {
        this.address = address;
    }

    public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }

    public String getgender() {
        return gender;
    }

    public void setgender(String gender) {
        this.gender = gender;

    }

    public String geteduc() {
        return educ;
    }

    public void seteduc(String educ) {
        this.educ = educ;
    }

    public void insertemployeedetails() throws SQLException {
        String q = String.format("INSERT INTO %s VALUES(NULL,%s,%s,%s,%s,%s,%s,%s)", tableName, firstname, middlename, lastname, address, age, gender, educ);
        data.query(q, true);
    }

    public static employeedetails getemployeeWithId(int id) throws Exception {
        String q = String.format("SELECT * FROM %s WHERE id = %d", tableName, id);
        ResultSet rs = data.query(q);
        if (!rs.next()) {
            throw new Exception("employee with id " + id + " was not found!");
        }

        employeedetails a = employeedetails.getemployeeFromResultSet(rs);
        return a;
    }

    public static ArrayList<employeedetails> searchemployeeByName(String s) throws SQLException {
        ArrayList<employeedetails> info = new ArrayList<>();
        String q = String.format("SELECT * from %s WHERE "
                + "firstname LIKE \"%%%s%%\" OR "
                + "middlename LIKE \"%%%s%%\" OR "
                + "lastname LIKE \"%%%s%%\"", tableName, s, s, s);

        ResultSet rs = data.query(q);

        while (rs.next()) {
            System.out.println("found");
            employeedetails a = getemployeeFromResultSet(rs);
            System.out.println(a);
            info.add(a);

        }

        return info;

    }

    public static employeedetails getemployeeFromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String firstname = rs.getString("firstname");
        String middlename = rs.getString("middlename");
        String lastname = rs.getString("lastname");
        String address = rs.getString("address");
        String age = rs.getString("age");
        String gender = rs.getString("gender");
        String educ = rs.getString("educ");

        employeedetails a = new employeedetails(id, firstname, middlename, lastname, address, age, gender, educ);
        return a;
    }

    public String toString() {
        return String.format(
                "==================\n"
                + "ID: %d\n"
                + "firstname:%s \n"
                + "middlename: %s \n"
                + "lastname:  %s\n"
                + "address:  %s\n"
                + "age:  %s\n"
                + "gender:  %s\n"
                + "educ:  %s\n",
                 id, firstname, middlename, lastname, address, age, gender, educ);
    }

    public static String[][] arraylistTo2dArray(ArrayList<employeedetails> as) {
        int rowSize = as.size();
        int colSize = 8;
        String[][] s = new String[rowSize][colSize];
        for (int i = 0; i < rowSize; i++) {
            employeedetails a = as.get(i);
            s[i][0] = a.getId() + "";
            s[i][1] = a.getFirstname();
            s[i][2] = a.getMiddlename();
            s[i][3] = a.getLastname();
            s[i][4] = a.getaddress();
            s[i][5] = a.getage();
            s[i][6] = a.getgender();
            s[i][7] = a.geteduc();
        }

        return s;
    }

}
