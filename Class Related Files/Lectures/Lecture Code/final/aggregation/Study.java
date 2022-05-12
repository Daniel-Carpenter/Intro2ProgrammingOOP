import java.util.ArrayList;

/* -----------------------------------------
 * |                 Study                 |
 * |---------------------------------------|
 * | -surveys: ArrayList<Survey>           |
 * |---------------------------------------|
 * | +Study()                              |
 * | +addSurvey(answers: boolean[]): void  |
 * | +getAvgTrue(questionIdx: int): double |
 * | +getAvgTrue(): double[]               |
 * -----------------------------------------
 * 
 * Objects of this class store a list of surveys for a study.
 */
public class Study
{
	private ArrayList<Survey> surveys;
	
	public Study()
	{
		surveys = new ArrayList<Survey>();
	}
	
	public void addSurvey(boolean[] answers)
	{
		Survey survey = new Survey(answers);
		surveys.add(survey);
	}
	
	// Return the average number of true answers for a given question.
	public double getAvgTrue(int questionIdx)
	{
		double average = 0;
		
		// Sum the number of true answers.
		for (Survey survey : surveys)
		{
			boolean answer = survey.getAnswer(questionIdx);
			
			if (answer == true) {
				average += 1;
			}
		}
		
		// Divide by the total number of answers.
		average = average / surveys.size();
		
		return average;
	}
	
	// Return the average number of true answers on all questions.
	public double[] getAvgTrue()
	{
		double[] averages = new double[Survey.NUM_QUESTIONS];
		
		for (int questionIdx = 0; questionIdx < Survey.NUM_QUESTIONS; 
				++questionIdx)
		{
			averages[questionIdx] = getAvgTrue(questionIdx);
		}
		
		return averages;
	}
}
