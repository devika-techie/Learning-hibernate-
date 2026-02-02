package com.kodnest.secondhibernate;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table
public class Bankuser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int userid;
	@Column
	String customername;
	@Column
	String customeremail;
	@Column
	String customerphone;
	@Column
	String accountnumber;
	@Column
	String password;
	@Column
	int amount;
	
	public Bankuser() {
		
	}

	public Bankuser(int userid, String customername, String customeremail, String customerphone, String accountnumber,
			String password, int amount) {
		super();
		this.userid = userid;
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerphone = customerphone;
		this.accountnumber = accountnumber;
		this.password = password;
		this.amount = amount;
	}

	public Bankuser(String customername, String customeremail, String customerphone, String accountnumber,
			String password, int amount) {
		super();
		this.customername = customername;
		this.customeremail = customeremail;
		this.customerphone = customerphone;
		this.accountnumber = accountnumber;
		this.password = password;
		this.amount = amount;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomeremail() {
		return customeremail;
	}

	public void setCustomeremail(String customeremail) {
		this.customeremail = customeremail;
	}

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bankuser [userid=" + userid + ", customername=" + customername + ", customeremail=" + customeremail
				+ ", customerphone=" + customerphone + ", accountnumber=" + accountnumber + ", password=" + password
				+ ", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountnumber, amount, customeremail, customername, customerphone, password, userid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bankuser other = (Bankuser) obj;
		return Objects.equals(accountnumber, other.accountnumber) && amount == other.amount
				&& Objects.equals(customeremail, other.customeremail)
				&& Objects.equals(customername, other.customername)
				&& Objects.equals(customerphone, other.customerphone) && Objects.equals(password, other.password)
				&& userid == other.userid;
	}
	
	
	
	

}
