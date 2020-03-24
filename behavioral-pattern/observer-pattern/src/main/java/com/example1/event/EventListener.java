package com.example1.event;

import java.io.File;

public interface EventListener {
	void update(String eventType, File file);
}
