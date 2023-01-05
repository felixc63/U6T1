public class Main {
    public static void main(String[] args){
        //Problem 1
        int[] heights = new int[3];
        for(int i = 0; i <= heights.length-1; i++){
            System.out.println(heights[i]);
        }
        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        for(int i = 0; i <= heights.length-1; i++){
            System.out.println(heights[i]);
        }

        //Problem 2
        boolean[] bool = {true, false, true, false, true, false};
        bool[0] = bool[3];
        System.out.println(bool.length);
        System.out.println(bool[0]);
        System.out.println(bool[5]);

        //Problem 3
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};
        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;
        for(int i = 0; i <= alphabeticalNames.length-1; i++){
            System.out.println(alphabeticalNames[i]);
        }

        //Problem 4
        double[] array1 = {7.5,10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {array1[0]+array2[0],array1[1]*array2[1]};
        System.out.println(array3[0]);
        System.out.println(array3[1]);

        //Problem 5
        String[] animals = new String[4];
        for(int i = 0; i <= animals.length-1; i++){
            System.out.println(animals[i]);
        }
        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";
        for(int i = 0; i <= animals.length-1; i++){
            System.out.println(animals[i]);
        }
        animals[2] += "s";
        System.out.println(animals[2]);
        System.out.println(animals.length);
        System.out.println(animals[2].length());

        //Problem 6
        Dog dog1 = new Dog("Sparky",4);
        Dog dog2 = new Dog("Toby",7);
        Dog dog3 = new Dog("Fiona",12);
        Dog[] dogs = {dog1,dog2,dog3};
        System.out.println(dogs[0].getName());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].getName());
    }
}
