package com.example1.event;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager implements Subject {
	private Map<String, List<EventListener>> listeners = new HashMap<>();

	public EventManager(String... operations) {
		for (String operation : operations) {
			this.listeners.put(operation, new ArrayList<>());
		}
	}

	@Override
	public void subscribe(String eventType, EventListener listener) {
		List<EventListener> subscribers = listeners.get(eventType);
		subscribers.add(listener);
	}

	@Override
	public void unsubscribe(String eventType, EventListener listener) {
		List<EventListener> subscribers = listeners.get(eventType);
		subscribers.remove(listener);
	}

	@Override
	public void notify(String eventType, File file) {
		List<EventListener> users = listeners.get(eventType);
		for (EventListener listener : users) {
			listener.update(eventType, file);
		}
	}
}
