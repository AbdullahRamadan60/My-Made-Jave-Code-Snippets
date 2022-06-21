
// Method to print 2D Array in a better way -> like table
public static void print2DArr(int [][] twoDArr) 
      {
        String arrToString = Arrays.deepToString(twoDArr);  //Converting array to string 
        String arrWithoutFirstBracket = arrToString.replaceFirst("\\[", "");  // removing this first bracket -> [
        String finalArrWithoutlastBracket = arrWithoutFirstBracket.substring(0,arrWithoutFirstBracket.length() - 1); //removing this end bracket -> ] 
        
        String [] split = finalArrWithoutlastBracket.split("(?<=],\\s+)");  //Split the string after each "], " . Which means split after each row
        
        for (int i = 0 ; i < split.length ; i++)
        {
        System.out.println(split[i]); //each part of the split will be in a new line
        }
      }
