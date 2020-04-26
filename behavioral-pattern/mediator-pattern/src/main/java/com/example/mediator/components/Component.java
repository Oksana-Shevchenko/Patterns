package com.example.mediator.components;

import com.example.mediator.Mediator;

public interface Component {
	void setMediator(Mediator mediator);
	String getName();
}
