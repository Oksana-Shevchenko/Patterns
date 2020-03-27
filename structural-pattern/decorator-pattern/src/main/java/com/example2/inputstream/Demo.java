package com.example2.inputstream;

import lombok.SneakyThrows;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo {
	@SneakyThrows
	public static void main(String[] args) {
		int c;

		File file = new File(Demo.class.getClassLoader().getResource("text.txt").getFile());
		InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file)));
		while ((c = in.read()) >= 0) {
			System.out.print((char)c);
		}
		in.close();
	}
}
