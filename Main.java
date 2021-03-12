import java.util.Scanner;

class Main {
  
  public static void menu(){
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    while((a<1)||(a>6)){
      System.out.println("1.Умножение матрицы №1 на число\n2.Умножение матриц\n3.Транспонирование матрицы №1\n4.Вычисление определителя\n5.Нахождение обратной матрицы\n6.Нахождение ранга матрицы\nВаш выбор: ");
      a = scanner.nextInt();
      if ((a>0)&&(a<6)){
        Matrix(a);
      };
      if((a>6)||(a<1)){
        System.out.print("Введите другой номер действия.\n");
      }
    }
    scanner.close();
  }
  
  public static void UmnNaChislo(int matrix1[][]){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int a = scanner.nextInt();
    for (int i = 0; i < matrix1.length ;i++ ){
      for (int j = 0; j < matrix1.length; j++){
        System.out.print(matrix1[i][j] * a);
        System.out.print(" "); 
      }
    System.out.println();
    }
    scanner.close();
  }
  
  public static void UmnMatr (int matrix1[][], int matrix2[][]){
    int q = matrix1.length;
    int result[][] = new int[q][q];
    for (int i = 0; i < q; i++) {
        for (int j = 0; j < q; j++) {
            for (int k = 0; k < q; k++) {
                result[i][j] += matrix1[i][k] * matrix2[k][j]; 
            }
        }
    }
    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[0].length; j++) {
          System.out.print(" " + result[i][j] + " ");
        }
      System.out.println();
    }
  }

  public static void TranspMatr(int matrix1[][]){
    int q = matrix1.length;
    int matrixTwo[][] = new int [q][q];
    System.out.println();
    System.out.println("Транспонированная матрица 1:");
    for (int i = 0; i < q; i++){
      for(int j = 0; j < q; j++){
        System.out.print(matrix1[j][i] + " ");
        matrixTwo[i][j] = matrix1[j][i];
      }
      System.out.println();
    }
  }

  public static void Opred(int matrix1[][]){
    int q = matrix1.length;
    if(q == 2){
      int t = matrix1[0][0] * matrix1[1][1] - matrix1[0][1] * matrix1[1][0];
      System.out.print(t);
    }
    else if(q == 3){
      int t = matrix1[0][0] * matrix1[1][1] * matrix1[2][2] + matrix1[1][0] * matrix1[2][1] * matrix1[0][2] + matrix1[2][0] * matrix1[0][1] * matrix1[1][2] - matrix1[0][2] * matrix1[1][1] * matrix1[2][0] - matrix1[1][2] * matrix1[2][1] * matrix1[0][0] - matrix1[2][2] * matrix1[0][1] * matrix1[1][0];
      System.out.print(t);        
    }
  }

  
  
  public static void Matrix(int a){
    Scanner scanner = new Scanner(System.in);
    System.out.print("\nВведите размер 1 матрицы: "); 
    int q = scanner.nextInt(); 
    int matrix1[][] = new int[q][q];
    System.out.print("Введите элементы 1 матрицы: ");
    for (int i  = 0; i < q ;i++ ){
      for (int j = 0; j < q; j++){
        matrix1[i][j] = scanner.nextInt();
      }
    }
    q = 0;
    System.out.print("Введите размер 2 матрицы: "); 
    q = scanner.nextInt();
    int matrix2[][] = new int[q][q];
    System.out.print("Введите элементы 2 матрицы: ");
    for (int i = 0; i < q ; i++ ){
      for (int j = 0; j < q ; j++ ){
        matrix2[i][j] = scanner.nextInt();
      }
    }
    switch(a){
        case 1:
          UmnNaChislo(matrix1);
          break;
        case 2:
          UmnMatr(matrix1, matrix2);
          break;
        case 3:
          TranspMatr(matrix1);
          break;
        case 4:
          Opred(matrix1);
          break;
        case 5:
          
          break;
        case 6:

          break;
    }
  }
  public static void main (String[] args) {
      menu();
  };
}