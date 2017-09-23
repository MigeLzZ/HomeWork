package by.itacademy.author.web.command;

import by.itacademy.author.web.command.impl.LoginActionImpl;

public class BasicChooser {

	public static BasicAction performAction(ActionType action) {

		BasicAction basicAction = null;

		switch (action) {
		case LOGIN:
			basicAction = new LoginActionImpl();
			break;
		case CLOSE:
			break;
		}
		
		return basicAction;
	}
}
