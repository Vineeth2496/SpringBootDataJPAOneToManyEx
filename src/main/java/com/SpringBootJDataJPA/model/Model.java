package com.SpringBootJDataJPA.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "modeltab")
public class Model {
	@Id
	@Column(name = "mid")
	private Integer modId;
	@Column(name = "mcode")
	private String modCode;
	@Column(name = "mcolor")
	private String modColor;
	@Column(name = "mcost")
	private Double modCost;
}
