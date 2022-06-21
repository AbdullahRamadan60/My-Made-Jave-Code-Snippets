
                        //*************** An amazing Guessing Game *************\\ 

       Random r = new Random();
       int randomNumber = r.nextInt(0, 100) + 0;  //Random Number between 0 & 100 inclusive.
       //System.out.println("The random number is : " + randomNumber);  //To check the value of the Random Number
       int guess;
       int trail = 0;
       boolean wrongGuess = true;
       
       Scanner scanner = new Scanner(System.in);
       
       while (wrongGuess == true)
       {
           System.out.println("Make a guess");
           guess = scanner.nextInt();
           
           if (guess == randomNumber)
           {
               wrongGuess = false;
               
               System.out.println("Congratulation. You guessed it right after " + trail + " wrong trails" );
           }
           else if (guess != randomNumber)
           {
               trail ++;
               
               if(randomNumber > guess)
               {
                   System.out.println("The number is higher than: " + guess);
               }
               else if (randomNumber < guess)
               {
                   System.out.println("The number is lower than: " + guess);
               }
           }
       }
