package Marble;

public class ChildProperty {

	int numOfBeat;
	public ChildProperty(int num) {
		this.numOfBeat = num;
	}
	public void Marbles(ChildProperty child, int obtainCount) {
		
		int obtainBeadCnt = child.loseMable(obtainCount);
		numOfBeat += obtainBeadCnt;
		
	}
	public int loseMable(int loseCount) {
		if (numOfBeat < loseCount) {
			int retValue = numOfBeat;
			numOfBeat = 0;
			return retValue;
		}
		numOfBeat -= loseCount;
		return loseCount;
	}
	public void showProperty() {
		System.out.println("보유 구슬의 갯수 :" + numOfBeat);
	}
}
