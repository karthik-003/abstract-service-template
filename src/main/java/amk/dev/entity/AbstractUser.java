package amk.dev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class AbstractUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long userId;
	@Column(name="user_name")
	String userName;
	
	public AbstractUser() {
		// TODO Auto-generated constructor stub
	}

	public AbstractUser(long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "AbstractUser [userId=" + userId + ", userName=" + userName + "]";
	}
	
	
}
