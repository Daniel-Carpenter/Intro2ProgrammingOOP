import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
		boolean[] first = {true, true, false};
		boolean[] second = {true, false, false};
		
		Study study = new Study();
		study.addSurvey(first);
		study.addSurvey(second);
		
		System.out.println(Arrays.toString(study.getAvgTrue()));
	}
}
