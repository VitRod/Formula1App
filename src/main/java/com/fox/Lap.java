package com.fox;

import java.time.Duration;

public class Lap implements Comparable<Lap> {

	private Duration duration;
	private Racer racer;

	public Lap(Duration duration, Racer racer) {
		this.duration = duration;
		this.racer = racer;
	}

	@Override
	public int compareTo(Lap o) {
		return duration.compareTo(o.getDuration());
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Racer getRacer() {
		return racer;
	}

	public void setRacer(Racer racer) {
		this.racer = racer;
	}
}
