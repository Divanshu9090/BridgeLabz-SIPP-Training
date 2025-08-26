package com.logisticroutetracker;

@FunctionalInterface
interface PenaltyCalculator {
 double calculate(Checkpoint cp);
}