package com.example.demo.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor

@Table(name="EMP_ADDR_TBL")
public class Address {
	

	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer addrId;
	private String city;
	private String state;
	private String country;
	private String type;
	
	private Emp eid;
	public Address(int i, String string, String string2, String string3, String string4, int j) {
		// TODO Auto-generated constructor stub
}
	
	

}
