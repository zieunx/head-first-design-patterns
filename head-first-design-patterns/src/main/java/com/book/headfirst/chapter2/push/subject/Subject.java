package com.book.headfirst.chapter2.push.subject;

import com.book.headfirst.chapter2.push.observer.Observer;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
