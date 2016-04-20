/*
 * Copyright 2016 Johannes Boczek
 */

package de.sogomn.rat.gui;

import static de.sogomn.rat.util.Constants.LANGUAGE;

public interface IRattyGui extends IGui {
	
	String SURVEILLANCE = LANGUAGE.getString("menu.surveillance");
	String FILE_MANAGEMENT = LANGUAGE.getString("menu.file_management");
	String UTILITY = LANGUAGE.getString("menu.utility");
	String OTHER = LANGUAGE.getString("menu.other");
	String POPUP = LANGUAGE.getString("action.popup");
	String SCREENSHOT = LANGUAGE.getString("action.screenshot");
	String DESKTOP = LANGUAGE.getString("action.desktop");
	String VOICE = LANGUAGE.getString("action.voice");
	String FILES = LANGUAGE.getString("action.files");
	String COMMAND = LANGUAGE.getString("action.command");
	String CLIPBOARD = LANGUAGE.getString("action.clipboard");
	String WEBSITE = LANGUAGE.getString("action.website");
	String AUDIO = LANGUAGE.getString("action.audio");
	String UPLOAD_EXECUTE = LANGUAGE.getString("action.upload_execute");
	String FREE = LANGUAGE.getString("action.free");
	String BUILD = LANGUAGE.getString("action.build");
	String ATTACK = LANGUAGE.getString("action.attack");
	String DROP_EXECUTE = LANGUAGE.getString("action.drop_execute");
	String CHAT = LANGUAGE.getString("action.chat");
	String INFORMATION = LANGUAGE.getString("action.information");
	String UNINSTALL = LANGUAGE.getString("action.uninstall");
	String KEYLOG = LANGUAGE.getString("action.keylog");
	String SHUT_DOWN = LANGUAGE.getString("action.shut_down");
	String RESTART = LANGUAGE.getString("action.restart");
	String MANAGE_SERVERS = LANGUAGE.getString("action.manage_servers");
	String CLOSE = "Close";
	
	void addClient(final ServerClient client);
	
	void removeClient(final ServerClient client);
	
	ServerClient getSelectedClient();
	
}
