package com.alex.jdeveloper;

public class ModelApp {
    private int a, b, sum;

       public void initProg(DataReaderInterface data, DataOutInterface text) {
          text.printToConsoleText("Enter a: ");
          a = data.readNumberFromConsole();
          text.printToConsoleText("Enter b: ");
          b = data.readNumberFromConsole();
       }
       public void calc(OperationInterface summation) {
          sum = summation.calcOperation(a, b);
       }
       public void finishProg(DataOutInterface data) {
          data.printToConsoleText("Result= ");
          data.printAnswer(sum);
       }
       public void starsInAnswer(PrintAnswerInStars stars) {
           stars.printAnswer(sum);
       }
}