package Model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class HocVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "not null")
    private String name;
    private Date date;
    @NotEmpty(message = "not null")
    private String address;
    private String phone;
    @NotEmpty(message = "not null")
    private String email;
    @ManyToOne
    //tại sao phải ManyToOne ms hết đỏ
    private Classroom classroom;

    public HocVien() {
    }

    public HocVien(int id, @NotEmpty(message = "not null") String name, Date date, @NotEmpty(message = "not null") String address, String phone, @NotEmpty(message = "not null") String email, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}