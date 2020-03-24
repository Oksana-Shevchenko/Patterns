package com.example1.event;

import java.io.File;

public interface Subject {
	void subscribe(String eventType, EventListener listener);
	void unsubscribe(String eventType, EventListener listener);
	void notify(String eventType, File file);
}
