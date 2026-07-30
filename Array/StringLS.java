public class StringLS {
    public static int linearSearch(String [] food, String key){
        for(int i = 0; i<food.length; i++){
            if(food[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        String food [] = {"Dosa", "Idli", "Momo", "Biryani"};
        String key = "Biryani";
        int dish = linearSearch(food, key);
        if(dish == -1){
            System.out.println("Not Available :)");
        } else {
            System.out.println("Your Dish is Available." );
        }
    } 
    
}
//   Time Complexity : O(n)