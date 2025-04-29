package com.domain.classes;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class GUIAlternative extends Frame {

	public GUIAlternative(String FrameTitle) {

		super(FrameTitle);
	}

	public void display() {
		setLayout(new GridLayout(2, 4));

		Label label1 = new Label("Label 1");
		Label label2 = new Label("Label 2");
		add(label1);
		add(label2);

		Label label3 = new Label("Label 3");
		Label label4 = new Label("Label 4");
		add(label3);
		add(label4);

		setSize(400, 300);
		setLocation(100, 100);
		setVisible(true);

	}

	public static void main(String args[]) {

		GUIAlternative gui = new GUIAlternative("title");
		gui.display();

	}

}