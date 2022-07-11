package com.book.headfirst.chapter2.pull.subject;

import com.book.headfirst.chapter2.pull.observer.Observer;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
