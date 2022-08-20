package com.productapp.dto;
import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.springframework.hateoas.RepresentationModel;

import io.swagger.v3.oas.annotations.media.Schema;

public class ProductDto extends RepresentationModel<ProductDto> {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Schema(description ="product name")
	@NotNull(message = "{productDto.name.absent}")
	@Pattern(regexp = "(\\s)*[A-Za-z]+((\\s)?((\\'|\\-|\\.)?([A-Za-z])+))*(\\s)*", message = "{productDto.name.invalid}")
	private String name;
	
	@NotNull(message = "{productDto.price.absent}")
	@Range(min = 100, max = 100000, message = "{productDto.price.invalid}")
	private BigDecimal price;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public ProductDto () {
		
	}
	public ProductDto(String name, BigDecimal price) {
		super();
		this.name = name;
		this.price = price;
	}

}
