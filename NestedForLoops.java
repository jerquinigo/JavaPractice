public class NestedForLoops {
    
    public static void main(String[] args) {
        String[][] fancyColors = {{"Red", "Blue", "Green"}, {"Cyan", "Magenta", "Turqiouse"}};
        
        for(int row = 0; row < fancyColors.length; row++) {
            for(int col = 0; col <= fancyColors.length; col++) {
                System.out.println(fancyColors[row][col]);
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println("i: " + i + ", j: " + j);
                
            }
        }

//         i: 0, j: 0
// i: 0, j: 1
// i: 0, j: 2
// i: 0, j: 3
// i: 0, j: 4
// i: 0, j: 5
// i: 0, j: 6
// i: 0, j: 7
// i: 0, j: 8
// i: 0, j: 9
// i: 1, j: 0
// i: 1, j: 1
// i: 1, j: 2
// i: 1, j: 3
// i: 1, j: 4
// i: 1, j: 5
// i: 1, j: 6
// i: 1, j: 7
// i: 1, j: 8
// i: 1, j: 9
// i: 2, j: 0
// i: 2, j: 1
// i: 2, j: 2
// i: 2, j: 3
// i: 2, j: 4
// i: 2, j: 5
// i: 2, j: 6
// i: 2, j: 7
// i: 2, j: 8
// i: 2, j: 9
// i: 3, j: 0
// i: 3, j: 1
// i: 3, j: 2
// i: 3, j: 3
// i: 3, j: 4
// i: 3, j: 5
// i: 3, j: 6
// i: 3, j: 7
// i: 3, j: 8
// i: 3, j: 9
// i: 4, j: 0
// i: 4, j: 1
// i: 4, j: 2
// i: 4, j: 3
// i: 4, j: 4
// i: 4, j: 5
// i: 4, j: 6
// i: 4, j: 7
// i: 4, j: 8
// i: 4, j: 9



    }
}