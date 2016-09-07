package edu.csumb.cst438fa16.laurachavez1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
*	A	half-secretive	map	of	questions	to	answers	(at	most	one	answer	per	question).
*	Gives	out	random	questions	(keys)	from	the	map,	and
*	can	be	queried	to	test	if	a	given	question	maps	to	a	given	answer.
*/
public	class	QuestionsAnswers	{
	private Map<String,String> qa = new HashMap<String,String>();
	/**
	 *	Maps	question	to	answer.
	*/
	public void put(String question, String answer)	{
		qa.put(question, answer);
	}
	/**
	*	Queries	if	question	maps	to	answer.
	*/
	public boolean testAnswer(String question, String answer)	{
		if(qa.containsKey(question) && qa.get(question).equals(answer)){
			return true;
		}
		else
			return false;
	}
	/**
	*	Gives	out	a	random	question from	the	key	set.
	*/
	public String getRandomQuestion()	{
		Random rand = new Random();
		int number = rand.nextInt(qa.size());
		int cnt = 0; 
		String question = "";
		for(String key: qa.keySet()){
			if(cnt == number){
				question = key;
				break;
			}
			cnt++;
		}
		return question;
	}
}