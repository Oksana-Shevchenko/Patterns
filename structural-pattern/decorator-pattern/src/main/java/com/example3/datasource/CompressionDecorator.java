package com.example3.datasource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompressionDecorator extends DataSourceDecorator {
	private int compLevel = 6;

	public CompressionDecorator(DataSource dataSource) {
		super(dataSource);
	}
}
