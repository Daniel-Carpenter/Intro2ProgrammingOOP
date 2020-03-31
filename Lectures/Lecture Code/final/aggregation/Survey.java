import java.util.Arrays;

/* -----------------------------------------
 * |                Survey                 |
 * |---------------------------------------|
 * | -answers: boolean[]                   |
 * | +NUM_QUESTIONS: int                   |
 * |  ------------------                   |
 * |---------------------------------------|
 * | +Survey(answers: boolean[])           |
 * | +getAnswer(questionIdx: int): boolean |
 * | +getAnswers(): boolean[]              |
 * | +toString(): String                   |
 * -----------------------------------------
 * 
 * This class stores the answers to a true/false survey. Each object stores the 
 * answers of a different person. The objects are immutable.
 */
public class Survey 
{
	private boolean[] answers;
	public static final int NUM_QUESTIONS = 3;
	
	public Survey(boolean[] answers)
	{
		// Create a copy so the answers cannot be changed through the array 
		// reference given to the constructor. Use a constant to specify the 
		// length of the copy so each Survey object has exactly the same number 
		// of questions.
		this.answers = Arrays.copyOf(answers, NUM_QUESTIONS);
	}
	
	public boolean getAnswer(int questionIdx)
	{
		return answers[questionIdx];
	}
	
	public boolean[] getAnswers()
	{
		// Create a copy so the calling method cannot change the answers.
		return Arrays.copyOf(answers, NUM_QUESTIONS);
	}
	
	public String toString()
	{
		return Arrays.toString(answers);
	}
}
