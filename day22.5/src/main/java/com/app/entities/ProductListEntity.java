package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data



@Entity
//@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@ToString
@RequiredArgsConstructor
public class ProductListEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int listId;

	private String name;
	@Column(length = 350)
	private String description;
	@Column(length = 350)
	private String quantity;
	@Column(length = 350)
	private String addnote;

	
	@ManyToOne
	@JoinColumn(name="userId")
	private UserEntity user;


}
