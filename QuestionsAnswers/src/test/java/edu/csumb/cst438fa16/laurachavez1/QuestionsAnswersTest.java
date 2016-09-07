package edu.csumb.cst438fa16.laurachavez1;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * Test Class for the QuestionsAnswersClass
 * @author Laura
 *
 */
public class QuestionsAnswersTest extends TestCase{

	@Test
	public void testQuestionsAnswersTestAnswer() {
		QuestionsAnswers qa  = new QuestionsAnswers();
		qa.put("question1", "answer1");
		assertEquals(qa.testAnswer("question1", "answer1"), true);
		assertEquals(qa.testAnswer("question1", "answer2"), false);
	}
	
	@Test
	public void testQuestionsAnswersGetRandomQuestion(){
		QuestionsAnswers qa  = new QuestionsAnswers();
		qa.put("question2", "answer2");
		assertTrue(qa.getRandomQuestion() != "");
		
	}

}
