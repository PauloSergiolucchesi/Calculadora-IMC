class Main {
  public static void main(String[] args) {
  
    double peso=77.8;
    double altura=1.77;
    double imc= peso/(altura*altura);
    System.out.println("seu imc é " + imc);
    if (imc < 18.5){
      System.out.println("magreza");
    }
    else if (imc<24.9){
      System.out.println("normal");
    }
    else if(imc<29.9){
      System.out.println("sobre peso");      
    }
    else if(imc<39.9){
      System.out.println("obesidade");
    }
    else {
      System.out.println("obesidade grave");
    }

 }
}