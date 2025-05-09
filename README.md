﻿# Homework-7
Part 1 – Iterator Pattern: Streaming Service Binge Mode
Project Description
This part simulates a tiny Netflix-like platform where:

A Series contains multiple Seasons.

Each Season contains multiple Episodes, stored using different internal data structures (ArrayList, LinkedList, etc.).

Iterators are used to uniformly access episodes, hiding storage details.

Features
EpisodeIterator Interface: Defines hasNext() and next() methods.

SeasonIterator: Normal order traversal.

ReverseSeasonIterator: Reverse order traversal.

ShuffleSeasonIterator: Random order traversal with a fixed seed for repeatability.

Season implements Iterable<Episode>: Enables Java's enhanced for-each loops.

BingeIterator: Chains episodes across multiple seasons to enable continuous watching.

Why use Iterator Pattern?
Instead of exposing internal structures like List<Episode>, the Iterator Pattern:

Protects internal data integrity (encapsulation).

Provides a flexible way to traverse collections without knowing how they are implemented.

Supports multiple traversal strategies (normal, reverse, shuffle).

Enables clean, readable code with enhanced for-loops.

Part 2 – Mediator Pattern: Airport Tower Simulator
Project Description
This part simulates aircraft communication coordinated through a ControlTower:

Different types of aircraft (PassengerPlane, CargoPlane, Helicopter) request runway access.

The ControlTower mediates all interactions to avoid direct aircraft-to-aircraft communication.

Features
TowerMediator Interface: Defines methods to broadcast messages and request runway access.

ControlTower Class:

Manages landing and take-off queues.

Handles emergencies (e.g., MAYDAY messages) by prioritizing critical aircraft.

Aircraft Classes:

PassengerPlane

CargoPlane

Helicopter

Emergency Handling: Immediate runway access for emergency aircraft and holding all others.

Simulation Driver:

Random aircraft activity using ScheduledExecutorService.

Real-time logging of tower decisions.

Why use Mediator Pattern?
Mediator Pattern centralizes complex communication by:

Decoupling many-to-many interactions between aircraft.

Simplifying maintenance and extension (e.g., adding new aircraft types).

Enabling centralized control (e.g., emergency handling).

Disadvantage:
ControlTower can become a bottleneck and a single point of failure if too much responsibility is centralized.

