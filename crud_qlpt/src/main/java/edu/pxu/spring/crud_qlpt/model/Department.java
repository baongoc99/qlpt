package edu.pxu.spring.crud_qlpt.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenphong")
    private String tenphong;

    
    @OneToMany(mappedBy = "phong", cascade = CascadeType.ALL)
    private Collection<User> users;

    public Department() {
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenphong() {
		return tenphong;
	}

	public void setTenphong(String tenphong) {
		this.tenphong = tenphong;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

    
}
