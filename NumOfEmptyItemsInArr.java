
// Method to get the number of the empty array items
public static int emptyItems(double [] decNums)   
      {
          int emptyItemCounter = 0;
          
          for (int i = 0 ; i < decNums.length ; i ++)
          {
              if (decNums[i] == 0)
              {
                  emptyItemCounter++;
              }
          }
          return emptyItemCounter;
      }
