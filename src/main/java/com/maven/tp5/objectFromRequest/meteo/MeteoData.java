package com.maven.tp5.objectFromRequest.meteo;

public class MeteoData {
	
	private int day;
	private int tmin;
	private int tmax;
	private int weather;
	private int probarain;
	
	public MeteoData() {
	}

	public int getProbrain() {
		return probarain;
	}

	public void setProbrain(int probarain) {
		this.probarain = probarain;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getTmin() {
		return tmin;
	}

	public void setTmin(int tmin) {
		this.tmin = tmin;
	}

	public int getTmax() {
		return tmax;
	}

	public void setTmax(int tmax) {
		this.tmax = tmax;
	}

	public int getWeather() {return weather;}

	public void getWeather(int weather) {
		this.weather = weather;
	}
	
	
}
