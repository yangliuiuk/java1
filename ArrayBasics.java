// Declaring array variables

int[] numbers;

// Creating arrays

numbers = new int[5];
int[] numbers = new int[5];

// Initializing arrays

numbers[0] = 1;
numbers[1] = 2;
numbers[2] = 3;
numbers[3] = 4;
numbers[4] = 5;

int[] numbers = {1,2,3,4,5};

// Accessing array elements

System.out.println(numbers[0]);
int x = numbers[0];
numbers[0] = 2;

// Array length

System.out.println(numbers.length);

// Array with loops

// Initializing arrays with loops

for (int i = 0; i < numbers.length; i ++)
    numbers[i] = i + 1;

java.util.Scanner input = new java.util.Scanner(System.in);
for (int i = 0; i < numbers.length; i ++)
    numbers[i] = input.nextInt();

// Displaying arrays

for (int i = 0; i < numbers.length; i++)
    System.out.println(numbers[i]);

// Summing all alements

int total = 0;
for (int i = 0; i < numbers.length; i++)
    total += numbers[i]

// Finding the largest element

int max = numbers[0];
int idx_max = 0;
for (int i = 0; i < numbers.length; i++){
    if (numbers[i] > max) {
        max = numbers[i];
        idx_max = i;
    }
}

// Copying arrays

int[] numbers2 = new int[numbers.length];
for (int i = 0; i < numbers.length; i++){
    numbers2[i] = numbers[i];
}
    
