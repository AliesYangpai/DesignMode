package org.alie.designmode.operatemode.oberver;

import java.util.Vector;

abstract class Subject {
    private Vector<Observer> vector = new Vector();

    public void addObserver(Observer eObserver) {
        vector.add(eObserver);
    }


    public void notifyAllObservers() {
        for (Observer observer : vector) {
            observer.update();
        }
    }
}
