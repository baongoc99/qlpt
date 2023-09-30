package edu.pxu.spring.crud_qlpt.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "hoten")
    private String hoten;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "namsinh")
    private int namsinh;
    @Column(name = "gioitinh")
    private boolean gioitinh;
    @Column(name = "quequan")
    private String quequan;
    @ManyToOne
    @JoinColumn(name = "vaitro_id")
    private Role vaitro;

    public User(Long id, String hoten, String diachi, int namsinh, boolean gioitinh, String quequan, Role vaitro) {
        this.id = id;
        this.hoten = hoten;
        this.diachi = diachi;
        this.namsinh = namsinh;
        this.gioitinh = gioitinh;
        this.quequan = quequan;
        this.vaitro = vaitro;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public Role getVaitro() {
        return vaitro;
    }

    public void setVaitro(Role vaitro) {
        this.vaitro = vaitro;
    }
}
