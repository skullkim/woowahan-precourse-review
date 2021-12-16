package baseball.model;

import baseball.utils.RandomGenerator;

public class ComputerPlayer {

	private final RandomGenerator randomGenerator;

	private int selectedNumber;

	public ComputerPlayer(final RandomGenerator randomGenerator) {
		this.randomGenerator = randomGenerator;
		this.selectedNumber = randomGenerator.getRandomNumber();
	}

	public int getSelectedNumber() {
		return selectedNumber;
	}

	public void generateNewRandomNumber() {
		this.selectedNumber = randomGenerator.getRandomNumber();
	}
}
