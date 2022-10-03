/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_Details;


public class EmProfile {
    
    private String EmpName;
    private String EmpId;
    private String Empage;
    private String EmpGender;
    private String StartDate;
    private String EmpLevel;
    private String EmpTeamId;
    private String EmpPosition;
    private String EmpCellNo;
    private String EmpEmail;
    private byte[] EmpPhoto;

    public String getName() {
        return EmpName;
    }

    public void setName(String name) {
        this.EmpName = name;
    }

    public String getEmpid() {
        return EmpId;
    }

    public void setEmpid(String empid) {
        this.EmpId = empid;
    }

    public String getAge() {
        return Empage;
    }

    public void setAge(String age) {
        this.Empage = age;
    }

    public String getGender() {
        return EmpGender;
    }

    public void setGender(String gender) {
        this.EmpGender = gender;
    }

    public String getStartdate() {
        return StartDate;
    }

    public void setStartdate(String startdate) {
        this.StartDate = startdate;
    }

    public String getLevel() {
        return EmpLevel;
    }

    public void setLevel(String level) {
        this.EmpLevel = level;
    }

    public String getTeaminfo() {
        return EmpTeamId;
    }

    public void setTeaminfo(String teaminfo) {
        this.EmpTeamId = teaminfo;
    }

    public String getPositiontitle() {
        return EmpPosition;
    }

    public void setPositiontitle(String positiontitle) {
        this.EmpPosition = positiontitle;
    }

    public String getCellno() {
        return EmpCellNo;
    }

    public void setCellno(String cellno) {
        this.EmpCellNo = cellno;
    }

    public String getEmail() {
        return EmpEmail;
    }

    public void setEmail(String email) {
        this.EmpEmail = email;
    }

    public byte[] getPhoto() {
        return EmpPhoto;
    }

    public void setPhoto(byte[] photo) {
        this.EmpPhoto = photo;
    }

   
    
}   
