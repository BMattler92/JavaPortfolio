//BarbaraMattler 2/16/16
public class License {
	private char[] correct={'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
	private char[] userAnswers;

	public License(char[] Answers)
	{
		{
			userAnswers = new char[Answers.length]; 
			for (int i = 0; i < Answers.length; i++)
			{
				userAnswers[i] = Answers[i]; 
			}
		}
	}
	//Correct Answers
	public int totalCorrect()
	{
		int correctCount = 0; 
		for (int i = 0; i < correct.length; i++)
		{
			if (userAnswers[i]==(correct[i]))
			{
				correctCount++; 
			}
		}
		return correctCount; 
	}
	//Incorrect Answers
	int[] missed = new int[correct.length];

	public int totalIncorrect()
	{
		int incorrectCount = 0; 
		for (int i = 0; i < correct.length; i++)
		{
			if (userAnswers[i]!=(correct[i]))
			{
				missed[incorrectCount] = i; 
				incorrectCount++; 
			}
		}
		return incorrectCount; 
	}
	//Passing score?
	public boolean passed()
	{
		if (totalCorrect() >= 15)
			return true; 
		else
			return false; 
	}
	//Missed questions
	public int[] questionsMissed()
	{
		int[] missedQuestions = new int[totalIncorrect()];
		for(int x= 0, missed=0;x < correct.length;x++)
		{
			if(correct[x] != userAnswers[x])
			{	
				missedQuestions[missed]=(x+1);
				missed++;
			}
		}
		return missedQuestions;
	}
}
