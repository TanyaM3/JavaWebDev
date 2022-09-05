package by.epam.homework.less11;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public Time(int hours, int minutes, int seconds) {
		setHours(hours);
		setMinutes(minutes);
		setSeconds(seconds);
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours < 0 || hours > 23) {
			this.hours = 0;
		} else {
			this.hours = hours;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes < 0 || minutes > 59) {
			this.minutes = 0;
		} else {
			this.minutes = minutes;
		}
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		if (seconds < 0 || seconds > 59) {
			this.seconds = 0;
		} else {
			this.seconds = seconds;
		}
	}

	public void addSeconds(int seconds) {
		this.seconds += seconds;
		if (this.seconds > 59) {
			int hoursToAdd = this.seconds / 3600;
			this.hours += this.seconds / 3600;
			int minToAdd = (this.seconds - hoursToAdd * 3600) / 60;
			this.minutes += (this.seconds - hoursToAdd * 3600) / 60;
			this.seconds = this.seconds - hoursToAdd * 3600 - minToAdd * 60;
		}
	}

	public void addMinutes(int minutes) {
		this.minutes += minutes;
		if (this.minutes > 59) {
			this.hours += this.minutes / 60;
			this.minutes = this.minutes % 60;
		}
	}

	public void addHours(int hours) {
		this.hours += hours;
		if (this.hours > 23) {
			this.hours = this.hours - 24;
		}
	}

	public void printTime() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
}