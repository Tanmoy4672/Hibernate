package com.view;

import com.model.TextBox;
import com.model.UIControl;

public class main {

	public static void main(String[] args) {
		drawUIControl(new TextBox());
	}
	
	public static void drawUIControl(UIControl control) {
		control.draw();
	}
}
