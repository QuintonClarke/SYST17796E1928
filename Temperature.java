// Quinton Clarke
// Feb 3rd, 2022
// Allows to find the average of temperatures

public class Temperature {
    
        public static void main (String[] args){
            
            int min = -100;
            int max = 100;
            int calcTotal = 0;
            int[] rangeTemp = new int[14];
            
            for (int i = 0; i < rangeTemp.length; i++){
                 rangeTemp[i] = (int)(Math.random()*(max - min)+ min);
                 System.out.print(rangeTemp[i]+ " ");
            }
            
            for (int i = 0; i < rangeTemp.length; i++){
                if (rangeTemp[i] >= 0 && rangeTemp[i] < 50){
                    calcTotal+= rangeTemp[i];
                }
                else if (rangeTemp[i] < 0 && rangeTemp[i] > -50){
                    calcTotal-= rangeTemp[i]*-1;
                }
                else {
                    calcTotal+=0;
                }
                    
            }
            double avg = calcTotal/14;
            System.out.println("\n---------------------------------------------");
            System.out.println("The average temperature is "+avg+" degrees");
            
        }
        
            
        
    }
    

