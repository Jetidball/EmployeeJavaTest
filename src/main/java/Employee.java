import java.util.Date;

public class Employee {

    private String name;
    private boolean managerFlag;
    private Date dateHired;
    private int id;

    public String getName() {
        return name;
    }

    public boolean getManagerFlag() {
        return managerFlag;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManagerFlag(boolean managerFlag) {
        this.managerFlag = managerFlag;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public void setId(int id) {
        this.id = id;
    }

}