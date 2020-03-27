package com.example2.inputstream;

import lombok.SneakyThrows;

import java.io.FilterInputStream;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}

	@SneakyThrows
	public int read() {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase(c));
	}

	@SneakyThrows
	public int read(byte[] b, int offset, int len) {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}
