package com.example.iron_deers_query_theory.Classes;

public class QuestionBuild
{
    public String question, opt1, opt2, opt3, opt4, correctAnswer;

    public QuestionBuild(String question, String opt1, String opt2, String opt3, String opt4, String correctAnswer)
    {
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestion()
    {
        return question;
    }

    public String getOpt1()
    {
        return opt1;
    }

    public String getOpt2()
    {
        return opt2;
    }

    public String getOpt3()
    {
        return opt3;
    }

    public String getOpt4()
    {
        return opt4;
    }

    public String getCorrectAnswer()
    {
        return correctAnswer;
    }
}