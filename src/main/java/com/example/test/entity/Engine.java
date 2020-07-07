package com.example.test.entity;

public class Engine {
int id;
String stroke;
int wheel;

public Engine(int id, String stroke, int wheel) {
	super();
	this.id = id;
	this.stroke = stroke;
	this.wheel = wheel;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStroke() {
	return stroke;
}
public void setStroke(String stroke) {
	this.stroke = stroke;
}
public int getWheel() {
	return wheel;
}
public void setWheel(int wheel) {
	this.wheel = wheel;
}
}
