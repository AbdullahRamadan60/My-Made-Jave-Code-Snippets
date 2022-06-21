
//This method is to search for int number in int array

public static void arrSearch(int[] yourIntArr,  int searchNum)  
      {
          int foundCounter = 0;
          for(int i = 0 ; i < yourIntArr.length ; i++)
          {
              if (yourIntArr[i] == searchNum)
              {
                  foundCounter++;   //Loop the array & if you find the search number, then increase the foundCounter by one
              }
          }
          
          switch (foundCounter)
          {
              case 0 :
                  System.out.println("The number is not in the array");
                  break;
                  
              case 1 :
                  System.out.println("The number is in the the array and it's repeated " + foundCounter + " time");
                  break;
                  
              default :
                  System.out.println("The number is in the the array and it's repeated " + foundCounter + " times");
                  break;
          }
          
      }
