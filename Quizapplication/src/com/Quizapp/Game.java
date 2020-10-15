package com.Quizapp;

public class Game {
    Question[] questions=new Question[5];
    Player player=new Player();
    String[] questionsdata={"What is the capital of Canada?",
    "Who invented Java?","Gate of India is located at?",
            "Dandia is a popular dance of?","Famous Dilwara temples are located at?"
            };
    String[] options1={"Sydney","Charles Babbage","Mumbai","Punjab","Uttar Pradesh"};
    String[] options2={"Perth","James Gosling","Delhi","Gujarat","Maharashtra"};
    String[] options3={"Ottawa","Brendan Eich","Nagpur","TamilNadu","Madhya Pradesh"};
    String[] options4={"Sacramento","Guido Van Rossum","Kolkata","Maharashtra","Rajasthan"};
    int[] answers={3,2,1,2,4};
    public void initGame(){
        for(int i=0;i<5;i++){
            questions[i]=new Question();
        }
        for(int i=0;i<5;i++){
            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }
    }
    public void play()
    {
        player.getDetails();
        for(int i=0;i<5;i++){
            boolean status=questions[i].askQuestion();
            if(status==true){
                System.out.println("you are a smart player");
                player.score=player.score+5;
            }
            else{
                System.out.println("Oops you need to study");
                player.score=player.score-5;
            }
        }
        System.out.println(player.name + "your score is" + player.score);
    }
}
