package com.logisticroutetracker;

import java.util.*;

public class RouteLinkedList<T extends Checkpoint>{
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }

    private Node head;

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);
        if (head == null) head = newNode;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;
        if (head.data.getCheckpointId().equals(checkpointId)) {
            head = head.next;
            return true;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data.getCheckpointId().equals(checkpointId)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getCheckpointId().equals(checkpointId)) return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.getDistance();
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public boolean checkCriticalConsistency() {
        Set<String> required = new HashSet<>(Arrays.asList("Delivery", "Fuel"));
        Set<String> found = new HashSet<>();
        Node temp = head;
        while (temp != null) {
            if (temp.data.isCritical()) found.add(temp.data.getType());
            temp = temp.next;
        }
        return found.containsAll(required);
    }

    public void printRoute() {
        Node temp = head;
        int count = 1;
        while (temp != null) {
            T cp = temp.data;
            System.out.printf("%d. %s – %s – %s – Penalty: %.1f\n",
                count++, cp.getClass().getSimpleName(), cp.getLocationName(),
                cp.isDelayed() ? "Delayed" : "On Time", cp.calculatePenalty());
            temp = temp.next;
        }
    }
}