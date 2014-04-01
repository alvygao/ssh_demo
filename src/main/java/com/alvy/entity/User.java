package com.alvy.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
@Table(name = "tuser")
public class User implements java.io.Serializable {
	private String id;
	private Date regtime;
	private String username;
	private String password;
	private List<User> friends;
	private List<User> friendsOf;
	private List<Car> cars;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_friend", joinColumns = { @JoinColumn(name = "userId", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "friendId", nullable = false, updatable = false) })
	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_friend", joinColumns = { @JoinColumn(name = "friendId", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "userId", nullable = false, updatable = false) })
	public List<User> getFriendsOf() {
		return friendsOf;
	}

	public void setFriendsOf(List<User> friendsOf) {
		this.friendsOf = friendsOf;
	}

	@OneToMany(mappedBy = "user")
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String code;

	@Transient
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public User() {
	}

	public User(String id, Date regtime, String username, String password) {
		super();
		this.id = id;
		this.regtime = regtime;
		this.username = username;
		this.password = password;
	}

	@Id
	@Column(name = "id", nullable = false, length = 36)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "regtime", length = 7)
	public Date getRegtime() {
		return regtime;
	}

	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}

	@Column(name = "username", unique = false, nullable = false, length = 100)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}