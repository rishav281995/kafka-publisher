package com.javatechie.spring.kafka.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor // lombok added
public class User {
	private int id;
	private String name;
	private String[] address;

}