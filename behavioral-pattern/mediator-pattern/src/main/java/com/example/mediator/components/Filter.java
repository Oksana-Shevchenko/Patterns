package com.example.mediator.components;

import com.example.mediator.Mediator;
import com.example.mediator.Note;
import lombok.Setter;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Filter extends JTextField implements Component {
	private Mediator mediator;
	private ListModel listModel;

	public Filter() {
	}

	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	@Override
	protected void processComponentKeyEvent(KeyEvent keyEvent) {
		String start = getText();
		searchElements(start);
	}

	private void searchElements(String s) {
		if (listModel == null) {
			return;
		}

		if (s.equals("")) {
			mediator.setElementsList(listModel);
			return;
		}

		List<Note> notes = new ArrayList<>();
		for (int i = 0; i < listModel.getSize(); i++) {
			notes.add((Note) listModel.getElementAt(i));
		}
		DefaultListModel<Note> listModel = new DefaultListModel<>();
		for (Note note : notes) {
			if (note.getName().contains(s)) {
				listModel.addElement(note);
			}
		}
		mediator.setElementsList(listModel);
	}

	public void setList(ListModel listModel) {
		this.listModel = listModel;
	}

	@Override
	public String getName() {
		return "Filter";
	}
}
