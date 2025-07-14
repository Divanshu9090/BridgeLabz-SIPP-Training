package com.browserhistorynavigation;

public abstract class Navigation {
	public abstract void prevHistory();

	public abstract void upcomingHistory();

	public abstract void backHistory();

	public abstract void nextHistory();

	public abstract void backHistory(String url);

	public abstract void nextHistory(String url);
}
